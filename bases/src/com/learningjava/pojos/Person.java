package com.learningjava.pojos;

import java.time.LocalDate;

public class Person {
	// INSTANCE VARIABLES
		private Long id;
		private String name;
		private LocalDate dateOfBirth;
		
		// CONSTRUCTORS
		
		public Person(Long id, String name, LocalDate dateOfBirth) {
			setId(id);
			setName(name);
			setDateOfBirth(dateOfBirth);
		}
		
		public Person(String name, LocalDate dateOfBirth) {
			this(null, name, dateOfBirth);
		}
		
		public Person (String name) {
			this(null, name, null);
		}
		
		public Person() {
			this(null, "ANÓNIMO", null);
			
		}
		// COPY CONSTRUCTOR
		public Person (Person person){
			this(person.getId(), person.name, person.dateOfBirth);
		}
		
		// GETTERS AND SETTERS (ACCESS METHODS)
		
		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			if(name == null || name.isBlank()) { // Is.empty at first, print NullPointerException!!
				throw new RuntimeException("Empty names are not allowed");
			}
			this.name = name.trim();
			
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		
		public void setDateOfBirth(LocalDate dateOfBirth) {
			if(dateOfBirth != null && dateOfBirth.isAfter(LocalDate.now())){
				throw new RuntimeException("You cannot be born in the future");
		}
			this.dateOfBirth = dateOfBirth;
	}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
		}

}