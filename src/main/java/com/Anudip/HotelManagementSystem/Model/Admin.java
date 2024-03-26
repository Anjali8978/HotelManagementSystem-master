package com.Anudip.HotelManagementSystem.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	private String admin_name;
	private String email_id;

	@OneToMany(mappedBy = "admin")
	private List<LandLord> landLords;

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	
	public void setLandLords(List<LandLord> landLords) {
		this.landLords = landLords;
	}

	public List<LandLord> getLandLords() {
		// TODO Auto-generated method stub
		return landLords;
	}

	public Admin(int admin_id, String admin_name, String email_id, List<LandLord> landLords) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.email_id = email_id;
		this.landLords = landLords;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", email_id=" + email_id + ", landLords="
				+ landLords + "]";
	}

	

	
	
}
