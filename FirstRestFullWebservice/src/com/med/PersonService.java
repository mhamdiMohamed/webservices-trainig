package com.med;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/PersonService")
public class PersonService {
	
   PersonDao personDao = new PersonDao();
   private static final String SUCCESS_RESULT="<result>OK</result>";
   private static final String FAILURE_RESULT="<result>FAIL</result>";


   @GET
   @Path("/persons")
   @Produces(MediaType.APPLICATION_XML)
   public List<Person> getPersons(){
      return personDao.getAllPersons();
   }

   @GET
   @Path("/persons/{id}")
   @Produces(MediaType.APPLICATION_XML)
   public Person getPerson(@PathParam("id") int id){
      return personDao.getPerson(id);
   }

   @PUT
   @Path("/persons")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String createPerson(@FormParam("id") int id,
      @FormParam("name") String name,
      @FormParam("age") int age,
      @Context HttpServletResponse servletResponse) throws IOException{
      Person person = new Person(id, name, age);
      int result = personDao.addPerson(person);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @POST
   @Path("/persons")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String updatePerson(@FormParam("id") int id,
      @FormParam("name") String name,
      @FormParam("age") int age,
      @Context HttpServletResponse servletResponse) throws IOException{
      Person person = new Person(id, name, age);
      int result = personDao.updatePerson(person);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @DELETE
   @Path("/persons/{id}")
   @Produces(MediaType.APPLICATION_XML)
   public String deletePerson(@PathParam("id") int id){
      int result = personDao.deletePerson(id);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @OPTIONS
   @Path("/persons")
   @Produces(MediaType.APPLICATION_XML)
   public String getSupportedOperations(){
      return "<operations>GET, PUT, POST, DELETE</operations>";
   }
}