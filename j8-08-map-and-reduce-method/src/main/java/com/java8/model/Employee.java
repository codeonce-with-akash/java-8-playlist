package com.java8.model;

public class Employee {
	private Integer id;
	private String name;
	private String grade;
	private Double sal;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String name, String grade, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.sal = sal;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", sal=" + sal + "]";
	}
	
	
	
}
