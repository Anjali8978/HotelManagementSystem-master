package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.ArrayList;

import com.Anudip.HotelManagementSystem.Model.Customer;
import com.Anudip.HotelManagementSystem.Model.Room;
import com.Anudip.HotelManagementSystem.Service.CustomerService;
import com.Anudip.HotelManagementSystem.Service.RoomService;

public class CustomerController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_name("SALMAN");
		customer.setCustomer_phnone_num("7988813698");
		customer.setCustomer_aadhar_num("879546123963");

		Room room = new Room();
		room.setRoom_id(2);
		room.setCustomer(customer);

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room);

		customer.setRooms(rooms);

		CustomerService customerService = new CustomerService();
		customerService.create(customer);

		RoomService roomService = new RoomService();
		roomService.update(room);
	}
}
