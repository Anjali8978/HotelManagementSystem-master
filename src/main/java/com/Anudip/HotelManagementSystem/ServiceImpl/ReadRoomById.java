package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Room;
import com.Anudip.HotelManagementSystem.Service.RoomService;

public class ReadRoomById {
	public static void main(String[] args) {
		int room_id = 2;

		RoomService roomService = new RoomService();

		Room room = roomService.readById(room_id);
		System.out.println(room.getRoom_id());
		System.out.println(room.getRoom_price());
		System.out.println(room.getRoom_status());
		System.out.println("Hotel id is " + room.getHotel());
		System.out.println("Customer id is " + room.getCustomer());
	}

}
