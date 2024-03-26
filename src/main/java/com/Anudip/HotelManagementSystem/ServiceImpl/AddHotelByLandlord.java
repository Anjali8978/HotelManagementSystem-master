package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class AddHotelByLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setId(3);

		int hotel_id = 3;
		LandlordService landlordService = new LandlordService();
		landlordService.addHotelById(hotel_id, landLord);

	}
}
