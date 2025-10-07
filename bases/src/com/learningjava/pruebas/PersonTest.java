package com.learningjava.pruebas;

import java.time.LocalDate;

import com.learningjava.pojos.Person;

public class PersonTest{
	public static void main(String[] args) {
		
		 var person = new Person(); // Llamo al constructor
		 
		 System.out.println(person.getId());
		 System.out.println(person.getName());
		 System.out.println(person.getDateOfBirth());
		 
		 System.out.println();
		 
		 person.setId(1L);
		 person.setName("   Guido Dev    ");
		 person.setDateOfBirth(LocalDate.of(2025, 10, 7));
		 
		 System.out.println(person.toString());
		 
		 var person2 = new Person(2L, "Jose" , LocalDate.of(2025, 10, 7));
	
		 System.out.println(person2);
		 
		 var person3 = new Person(person2);
		 
		 person3.setId(3L);
		 
		 System.out.println();
		 System.out.println(person2);
		 System.out.println(person3);
	}

}
