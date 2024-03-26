package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Service.AdminService;

public class SaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("Kanak");
		admin.setEmail_id("thakurkanak02@gmail.com");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
