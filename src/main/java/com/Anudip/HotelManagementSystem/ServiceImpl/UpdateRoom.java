package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Room;
import com.Anudip.HotelManagementSystem.Service.RoomService;

public class UpdateRoom {
	public static void main(String[] args) {
		Room room= new Room();
		room.setRoom_id(1);
		room.setRoom_price(5000.00);
		
		RoomService roomService= new RoomService();
		roomService.update(room);
	}
}
