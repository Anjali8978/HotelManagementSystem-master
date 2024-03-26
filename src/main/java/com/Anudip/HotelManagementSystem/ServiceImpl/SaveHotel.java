package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Hotel;
import com.Anudip.HotelManagementSystem.Service.HotelService;

public class SaveHotel {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
		hotel.setHotel_name("TAJ HOTEL");
		hotel.setHotel_location("MUMBAI");
		hotel.setNum_of_rooms(3);
		hotel.setRating(4);

		Hotel hotel2 = new Hotel();
		hotel2.setHotel_name("THE LALIT");
		hotel2.setHotel_location("MUMBAI");
		hotel2.setNum_of_rooms(3);
		hotel2.setRating(4);

		Hotel hotel3 = new Hotel();
		hotel3.setHotel_name("IBIS");
		hotel3.setHotel_location("VASHI");
		hotel3.setNum_of_rooms(3);
		hotel3.setRating(5);

		HotelService hotelService = new HotelService();
		hotelService.create(hotel);
		hotelService.create(hotel2);
		hotelService.create(hotel3);
		
	}
}
