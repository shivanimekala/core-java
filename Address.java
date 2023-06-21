package com.java3;

public class Address {
	String Address,City,State,Country;
	Long Zipcode;
	public Address(String string, String string2, String string3, String string4, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Long getZipcode() {
		return Zipcode;
	}
	public void setZipcode(Long zipcode) {
		Zipcode = zipcode;
	}
	void display() {System.out.println("Address [Address=" + Address + ", City=" + City + ", State=" + State + ", Country=" + Country
				+ ", Zipcode=" + Zipcode + "]");
}
}