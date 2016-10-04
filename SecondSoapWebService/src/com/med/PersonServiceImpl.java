package com.med;

import java.io.IOException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebFault;

@WebService(endpointInterface="com.med.PersonService")
public class PersonServiceImpl implements PersonService {

	PersonDao personDao = new PersonDao();
	private static final String SUCCESS_RESULT = "<result>OK</result>";
	private static final String FAILURE_RESULT = "<result>FAIL</result>";

	public Object[] getPersons() {
		return personDao.getAllPersons().toArray();
	}

	public Person getPerson(int id) {
		return personDao.getPerson(id);
	}

	public String createPerson(int id, String name, int age) throws IOException {
		Person person = new Person(id, name, age);
		int result = personDao.addPerson(person);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	public String updatePerson(int id, String name, int age) throws IOException {
		Person person = new Person(id, name, age);
		int result = personDao.updatePerson(person);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}

	public String deletePerson(int id) {
		int result = personDao.deletePerson(id);
		if (result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
}