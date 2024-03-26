package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Service.RoomService;

public class DeleteRoom {
	public static void main(String[] args) {
		int room_id=1;
		
		RoomService roomService= new RoomService();
		roomService.deleteById(room_id);
	}
}
