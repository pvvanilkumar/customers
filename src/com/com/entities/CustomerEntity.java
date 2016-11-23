package com.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.com.dto.CustomerV1;


@Entity
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String customerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="phonenumber")
	private long phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	//Getter and Setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//End
	
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", name=" + name + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	//toDto()
	public CustomerV1 toDto()
	{
		return new CustomerV1();
	}

}
