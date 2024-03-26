package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class UpdateLandlord {
	public static void main(String[] args) {
		LandLord landLord= new LandLord();
		landLord.setId(2);
		landLord.setName("NISHANT");
		
		LandlordService landlordService= new LandlordService();
		landlordService.update(landLord);
	}
}
