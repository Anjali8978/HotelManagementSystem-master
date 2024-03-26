package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.AdminService;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class SaveLandlord {
	public static void main(String[] args) {
		LandlordService landlordService = new LandlordService();
		AdminService adminService = new AdminService();
		
		 Admin admin = new Admin();
	        admin.setAdmin_name("Kanak");
	        admin.setEmail_id("thakurkanak02@gmail.com");
	        adminService.create(admin);
	        
		LandLord landLord = new LandLord();
		landLord.setName("Mr.Smith");
		landLord.setAddress("123 Main Street");
		landLord.setStatus("approved");
		landLord.setAdmin(admin);
		landlordService.create(landLord);
//
//		LandLord landLord1 = new LandLord();
//		landLord1.setName("SNEHA");
//		landLord1.setAddress("VASHI");
//		landLord.setStatus("approved");
//
//		LandLord landLord2 = new LandLord();
//		landLord2.setName("SABURI");
//		landLord2.setAddress("NAVI MUMBAI");
//		landLord.setStatus("approved");

//		LandlordService landlordService = new LandlordService();
//		AdminService adminService = new AdminService();
//		landlordService.create(landLord);
//		landlordService.create(landLord1);
//		landlordService.create(landLord2);
		
		
	}
}
