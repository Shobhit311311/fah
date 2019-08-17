package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer merchantId;
	
	@Column(length=20, nullable=false)
	private String firstName;
	
	@Column(length=20, nullable=true)
	private String lastName;
	
	@Column(length=30, nullable=false)
	private String company;
	
	@Column(length=30, nullable=false, unique=true)
	private String emailid;
	
	@Column(length=10, nullable=false, unique=true)
	private Long mobileno;
	
	@Column(length=30, nullable=false)
	private String password;
	
	@Column(length=100)
	private String photo;
	
	@Column(length=5, nullable=false)
	private Double rating;

	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	public Merchant(String firstName, String lastName, String company, String emailid, Long mobileno, String password,
			String photo, Double rating) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.password = password;
		this.photo = photo;
		this.rating = rating;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", company=" + company + ", emailid=" + emailid + ", mobileno=" + mobileno + ", password=" + password
				+ ", photo=" + photo + ", rating=" + rating + "]";
	}
	
	
	
}