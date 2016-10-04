package com.med;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class WebServiceTester  {

   private Client client;
   private String REST_SERVICE_URL = "http://localhost:8080/FirstRestFullWebservice/rest/PersonService/persons";
   private static final String SUCCESS_RESULT="<result>OK</result>";
   private static final String PASS = "pass";
   private static final String FAIL = "fail";

   private void init(){
      this.client = ClientBuilder.newClient();
   }

   public static void main(String[] args){
      WebServiceTester tester = new WebServiceTester();
      tester.init();
      tester.testGetAllPersons();
      tester.testGetPerson();
      tester.testUpdatePerson();
      tester.testAddPerson();
      tester.testDeletePerson();
   }

   private void testGetAllPersons(){
      GenericType<List<Person>> list = new GenericType<List<Person>>() {};
      List<Person> persons = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .get(list);
      String result = PASS;
      if(persons.isEmpty()){
         result = FAIL;
      }
      System.out.println("GetAll, Result: " + result );
   }

   private void testGetPerson(){
      Person samplePerson = new Person();
      samplePerson.setId(1);

      Person person = client
         .target(REST_SERVICE_URL)
         .path("/{id}")
         .resolveTemplate("id", 1)
         .request(MediaType.APPLICATION_XML)
         .get(Person.class);
      String result = FAIL;
      if(samplePerson != null && samplePerson.getId() == person.getId()){
         result = PASS;
      }
      System.out.println("Get, Result: " + result );
   }

   private void testUpdatePerson(){
      Form form = new Form();
      form.param("id", "1");
      form.param("name", "MED");
      form.param("age", "32");

      String callResult = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Update: " + result );
   }

   private void testAddPerson(){
      Form form = new Form();
      form.param("id", "2");
      form.param("name", "Med");
      form.param("age", "32");

      String callResult = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .put(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
   
      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Add, Result: " + result );
   }

   private void testDeletePerson(){
      String callResult = client
         .target(REST_SERVICE_URL)
         .path("/{id}")
         .resolveTemplate("id", 2)
         .request(MediaType.APPLICATION_XML)
         .delete(String.class);

      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Delete, Result: " + result );
   }
}