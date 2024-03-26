package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.List;

import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class ReadAllLandlord {
	public static void main(String[] args) {
		LandlordService landlordService = new LandlordService();
		List<LandLord> landLord = landlordService.readAllLandlord();
		for (LandLord landLord2 : landLord) {
			System.out.println(landLord2.getId());
			System.out.println(landLord2.getName());
			System.out.println(landLord2.getAddress());
			System.out.println(landLord2.getStatus());
			System.out.println();
		}
	}

}
