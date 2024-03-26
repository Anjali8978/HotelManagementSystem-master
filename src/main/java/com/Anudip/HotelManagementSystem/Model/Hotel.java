package com.Anudip.HotelManagementSystem.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotel_id;
	private String hotel_name;
	private String hotel_location;
	private int num_of_rooms;
	private int rating;

	@OneToMany(mappedBy = "hotel")
	private List<Room> room;
	
	@ManyToOne
	@JoinColumn(name = "landlord_id")
	private LandLord landLord;

	
	public Integer getNum_of_rooms() {
		return num_of_rooms;
	}

	public void setNum_of_rooms(Integer num_of_rooms) {
		this.num_of_rooms = num_of_rooms;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_location() {
		return hotel_location;
	}

	public void setHotel_location(String hotel_location) {
		this.hotel_location = hotel_location;
	}


	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	public LandLord getLandLord() {
		return landLord;
	}

	public void setLandLord(LandLord landLord) {
		this.landLord = landLord;
	}

	public Hotel(int hotel_id, String hotel_name, String hotel_location, Integer num_of_rooms, Integer rating,
			List<Room> room, LandLord landLord) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.hotel_location = hotel_location;
		this.num_of_rooms = num_of_rooms;
		this.rating = rating;
		this.room = room;
		this.landLord = landLord;
	}

	public Hotel() {
		super();
	}

	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", hotel_location=" + hotel_location
				+ ", num_of_rooms=" + num_of_rooms + ", rating=" + rating + ", room=" + room + ", landLord=" + landLord
				+ "]";
	}


}
