package com.med;

import java.io.IOException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebFault;

@WebService
public class PersonService {

	PersonDao personDao = new PersonDao();
	private static final String SUCCESS_RESULT = "<result>OK</result>";
	private static final String FAILURE_RESULT = "<result>FAIL</result>";

	@WebMethod
	public Object[] getPersons() {
		return personDao.getAllPersons().toArray();
	}

	@WebMethod
	public Person getPerson(@WebParam(name = "id") int id) {
		return personDao.getPerson(id);
	}

	@WebMethod
	public String createPerson(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
			@WebParam(name = "age") int age) throws IOException {
		Person person = new Person(id, name, age);
		int result = personDao.addPerson(person);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	@WebMethod
	public String updatePerson(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
			@WebParam(name = "age") int age) throws IOException {
		Person person = new Person(id, name, age);
		int result = personDao.updatePerson(person);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	@WebMethod
	public String deletePerson(@WebParam(name = "id") int id) {
		int result = personDao.deletePerson(id);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
}