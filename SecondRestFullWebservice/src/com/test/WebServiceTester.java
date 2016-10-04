package com.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class WebServiceTester  {

   private static Client client;
   private static String REST_SERVICE_URL = "http://localhost:8080/FirstRestFullWebservice/rest/OperationService";

   private void init(){
      this.client = ClientBuilder.newClient();
   }

   public static void main(String[] args){
      WebServiceTester tester = new WebServiceTester();
      tester.init();

      Form form = new Form();
      form.param("a", "1");
      form.param("b", "4");

      String callResult = client
         .target(REST_SERVICE_URL)
         .path("/add")
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      System.out.println(callResult);

       callResult = client
         .target(REST_SERVICE_URL)
         .path("/substract")
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      System.out.println(callResult);

       callResult = client
         .target(REST_SERVICE_URL)
         .path("/multiply")
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      System.out.println(callResult);

       callResult = client
         .target(REST_SERVICE_URL)
         .path("divide")
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      System.out.println(callResult);
      
   }
}