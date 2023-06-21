package com.java3;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		Employeedetails e = new Employeedetails(0, null, null, null, null, null, null, null, 0);
		Address a= new Address(null, null, null, null, 0);
		e.setId(108);
		e.setFirstname("meghana");
		e.setLastname("etukala");
		e.setGender("Female");
		e.setDepartment("It");
		e.setPosition("Senior developer");
		e.setHiredate("july 28th");
		e.setDateofbirth("aug28th1995");
		e.setSalary(179000);
		a.setAddress("Flatno:402");
		a.setCity("Farmington hills");
		a.setCountry("Usa");
		a.setState("Michigan");
		a.setZipcode(48335l);
		e.display();
		a.display();
		
	}

}
