package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Student {
@Id 
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int id;
private String name;
private String  Address;

public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
	
}
	public Student() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}

}
