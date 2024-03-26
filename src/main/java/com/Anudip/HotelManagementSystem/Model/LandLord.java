package com.Anudip.HotelManagementSystem.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LandLord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Address;
	private String status;
     
	@OneToMany(mappedBy = "landLord")
	private List<Hotel> hotels;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	public LandLord(int id, String name, String address, String status, List<Hotel> hotels, Admin admin,
			Integer admin_admin_id) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.status = status;
		this.hotels = hotels;
		this.admin = admin;
	}
	public LandLord() {
		super();
	}
	@Override
	public String toString() {
		return "LandLord [id=" + id + ", name=" + name + ", Address=" + Address + ", status=" + status + ", hotels="
				+ hotels + ", admin=" + admin + " ]";
	}

	
	

}
