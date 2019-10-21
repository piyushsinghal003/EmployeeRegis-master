package com.cts.employeemanagementsystem.bean;

public class Employee {
private String empID;
public Employee() {

}
private String firsrName;
private String lastName;
private float salary;
public String getEmpID() {
	return empID;
}
public void setEmpID(String empID) {
	this.empID = empID;
}
public String getFirsrName() {
	return firsrName;
}
public void setFirsrName(String firsrName) {
	this.firsrName = firsrName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(String empID, String firsrName, String lastName, float salary) {
	super();
	this.empID = empID;
	this.firsrName = firsrName;
	this.lastName = lastName;
	this.salary = salary;
}
}
