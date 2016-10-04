package com.med;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface PersonService {

	@WebMethod
	public Object[] getPersons();

	@WebMethod
	public Person getPerson(@WebParam(name = "id") int id);

	@WebMethod
	public String createPerson(@WebParam(name = "id") int id, 
			@WebParam(name = "name")String name,
			@WebParam(name = "age") int age) throws IOException;

	@WebMethod
	public String updatePerson(@WebParam(name = "id") int id, 
			@WebParam(name = "name")String name,
			@WebParam(name = "age") int age) throws IOException;

	@WebMethod
	public String deletePerson(@WebParam(name = "id") int id);
	
}
