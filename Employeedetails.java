package com.java3;

public class Employeedetails {
	int id;
	String Firstname,Lastname,Gender,position,department;
	String Dateofbirth,Hiredate;
    long Salary; 
    
	public Employeedetails(int id, String Firstname , String Lastname, String Gender, String position, String department,
			String Dateofbirth, String Hiredate, long Salary) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.Dateofbirth = dateofbirth;
	}
	public String getHiredate() {
		return Hiredate;
	}
	public void setHiredate(String hiredate) {
		this.Hiredate = hiredate;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		this.Salary = salary;
	}
	
	void display() {System.out.println( "Employeedetails [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Gender="
				+ Gender + ", position=" + position + ", department=" + department + ", Dateofbirth=" + Dateofbirth
				+ ", Hiredate=" + Hiredate + ", Salary=" + Salary + "]");
	}
}
