package com.med;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
	public PersonDao() {
		try {
			verifyFileExistance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<Person> getAllPersons() {
		List<Person> personList = null;
		try {
			personList = verifyFileExistance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return personList;
	}

	private List<Person> verifyFileExistance() throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Person> personList;
		File file = new File("persons.dat");
		if (!file.exists()) {
			Person person = new Person(1, "Med", 32);
			personList = new ArrayList<Person>();
			personList.add(person);
			savePersonList(personList);
		} else {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			personList = (List<Person>) ois.readObject();
			ois.close();
		}
		return personList;
	}

	public Person getPerson(int id) {
		List<Person> personList = getAllPersons();

		for (Person person : personList) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	public int addPerson(Person aPerson) {
		List<Person> personList = getAllPersons();
		boolean personExists = false;
		for (Person person : personList) {
			if (person.getId() == aPerson.getId()) {
				personExists = true;
				break;
			}
		}
		if (!personExists) {
			personList.add(aPerson);
			savePersonList(personList);
			return 1;
		}
		return 0;
	}

	public int updatePerson(Person aPerson) {
		List<Person> personList = getAllPersons();

		for (Person person : personList) {
			if (person.getId() == aPerson.getId()) {
				int index = personList.indexOf(person);
				personList.set(index, aPerson);
				savePersonList(personList);
				return 1;
			}
		}
		return 0;
	}

	public int deletePerson(int id) {
		List<Person> personList = getAllPersons();

		for (Person person : personList) {
			if (person.getId() == id) {
				int index = personList.indexOf(person);
				personList.remove(index);
				savePersonList(personList);
				return 1;
			}
		}
		return 0;
	}

	private void savePersonList(List<Person> personList) {
		try {
			File file = new File("persons.dat");
			FileOutputStream fos;

			fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(personList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}