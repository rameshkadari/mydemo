package com.mydemogit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

/**
 * @author ramesh
 *
 */
@SuppressWarnings("serial")
@Entity

@Table(name = "contact_mstr")
public class Contacts implements Serializable {

	private Integer phonenumber;
	private String name;
	private String pan;
	private String adhar;
	private String fatherName;
	private String degree;
	private String email;
	private String passport;

	@Column(name = "MOB_NO, , , ")
	public Integer getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PAN")
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Column(name = "ADHAR")
	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	@Column(name = "F_NAME")
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "DEGREE")
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSPORT")
	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Contacts [phonenumber=" + phonenumber + ", name=" + name + ", pan=" + pan + ", adhar=" + adhar
				+ ", fatherName=" + fatherName + ", degree=" + degree + ", email=" + email + ", passport=" + passport
				+ "]";
	}

}
