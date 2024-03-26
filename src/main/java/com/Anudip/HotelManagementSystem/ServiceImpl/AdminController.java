package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.ArrayList;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.AdminService;
import com.Anudip.HotelManagementSystem.Service.LandlordService;

public class AdminController {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("KANAK");
		admin.setEmail_id("thakurkanak02@gmail.com");

		LandLord landLord = new LandLord();
		landLord.setName("NISHNAT");
		landLord.setAddress("NERUL");
		landLord.setAdmin(admin);
		LandLord landLord1 = new LandLord();
		landLord1.setName("SNEHA");
		landLord1.setAddress("VASHI");
		landLord1.setAdmin(admin);
		LandLord landLord2 = new LandLord();
		landLord2.setName("SABURI");
		landLord2.setAddress("NAVI MUMBAI");
		landLord2.setAdmin(admin);

		ArrayList<LandLord> landLords = new ArrayList<LandLord>();
		landLords.add(landLord);
		landLords.add(landLord1);
		landLords.add(landLord2);

		admin.setLandLords(landLords);

		AdminService adminService = new AdminService();
		adminService.create(admin);

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		System.out.println("");

	}
}
