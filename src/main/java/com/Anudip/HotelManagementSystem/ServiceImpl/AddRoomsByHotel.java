package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Hotel;
import com.Anudip.HotelManagementSystem.Service.HotelService;

public class AddRoomsByHotel {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setHotel_id(3);

		int room_id=9;
		HotelService hotelService = new HotelService();
		hotelService.addRoomsByHotelId(room_id, hotel);
	}
}
