package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);
                Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("nabil");
		p.setLastName("nabil");
		persons.add(p);
		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mohammed");
		p.setLastName("Shalaby");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Basem");
		p.setLastName("Salama");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("AbdulHalim");
		p.setLastName("Mahmoud");
		persons.add(p);
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("salah");
		p.setLastName("salah");
		persons.add(p);
		p = new Person();
		p.setId("55");
		p.setAge(25);
		p.setFirstName("dd");
		p.setLastName("dd");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

