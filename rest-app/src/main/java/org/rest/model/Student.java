package org.rest.model;

public class Student {
private int id;
private String firstname;
private String lastname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
private String stream;
}
