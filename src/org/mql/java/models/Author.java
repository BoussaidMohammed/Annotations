package org.mql.java.models;

import org.mql.java.annotations.ComboField;
import org.mql.java.annotations.FormType;
import org.mql.java.annotations.RadioField;
import org.mql.java.annotations.TextField;

@FormType(title = "Nouveau Autheur")
public class Author {
	@TextField(label = "identification")
	private int id;
	@TextField(label = "prénom")
	private String firstName;
	@TextField(label = "nom")
	private String lastName;
	@RadioField(items = {"male", "female"})
	private String sexe;
	@TextField
	private int age;
	@ComboField(items = {"Ingénieurie","Recherche","Management"})
	private String workField;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWorkField() {
		return workField;
	}
	public void setWorkField(String workField) {
		this.workField = workField;
	}
	public Author(int id, String firstName, String lastName, String sexe, int age, String workField) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sexe = sexe;
		this.age = age;
		this.workField = workField;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
