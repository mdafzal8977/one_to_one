package com.example.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String brand;
	@OneToOne
	@JsonIgnore
	private Student student;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Laptop(Integer id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
