package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.List;

import com.Anudip.HotelManagementSystem.Model.Hotel;
import com.Anudip.HotelManagementSystem.Service.HotelService;

public class ReadAllHotel {
	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		List<Hotel> hotels = hotelService.readAllHotel();

		for (Hotel hotel : hotels) {
			System.out.println(hotel.getHotel_id());
			System.out.println(hotel.getHotel_name());
			System.out.println("Location = "+hotel.getHotel_location());
			System.out.println("Number of Room = " + hotel.getNum_of_rooms());
			System.out.println("Hotel rating = " + hotel.getRating());
			System.out.println();
		}
}
}