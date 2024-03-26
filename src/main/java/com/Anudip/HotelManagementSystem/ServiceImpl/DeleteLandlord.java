package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class DeleteLandlord {
	
		public static void main(String[] args) {
			int landlord_id = 1;
			LandlordService landlordService = new LandlordService();
			landlordService.delete(landlord_id);
		}
}
