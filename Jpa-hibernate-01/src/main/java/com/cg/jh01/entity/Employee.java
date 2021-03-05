package com.cg.jh01.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable{
	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="emp_name")
	private String empName;
	private Double salary;
	@Column(name="doj")
	private LocalDate datejoined;
	
	public Employee() {
		/*Default constructor*/
	}
	public Employee(Long empId, String empName, Double salary, LocalDate datejoined) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.datejoined = datejoined;
	}
	public Long getEmpId() {
		return empId;
	}
	public LocalDate getDatejoined() {
		return datejoined;
	}
	public void setDatejoined(LocalDate datejoined) {
		this.datejoined = datejoined;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, salary=%s, datejoined=%s]", empId, empName, salary,
				datejoined);
	}
	
	
}
