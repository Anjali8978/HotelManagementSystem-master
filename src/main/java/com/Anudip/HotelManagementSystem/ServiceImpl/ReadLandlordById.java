package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class ReadLandlordById {
	public static void main(String[] args) {
		int landlord_id = 2;

		LandlordService landlordService = new LandlordService();
		LandLord landLord = landlordService.readById(landlord_id);
		if(landLord != null) {
		System.out.println(landLord.getId());
		System.out.println(landLord.getName());
		System.out.println(landLord.getAddress());
		System.out.println(landLord.getStatus());
	}else {
		System.out.println("Lnadlord with ID "+ landlord_id + "not found.");
	}
}
}