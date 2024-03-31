package com.example.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private int marks;
	@OneToOne(mappedBy="student")
	@JsonIgnore
	private Laptop laptop;
	public int getId() {
		return id;
	}
	public Student(int id, String name, int marks,Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.laptop=laptop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
