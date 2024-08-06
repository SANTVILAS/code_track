package com.vilastech.blc;

public class Docter {
	private static int idCounter=1;
	private int id;
	private String name;
	private String specialty;
	

	
	

	public Docter(String name, String specialty) {
		super();
		this.name = name;
		this.specialty = specialty;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}




	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + ", specialty=" + specialty + "]";
	}
	
	
	
	
}
