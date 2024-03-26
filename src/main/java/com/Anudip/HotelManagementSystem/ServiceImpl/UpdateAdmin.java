package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Service.AdminService;

public class UpdateAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		admin.setAdmin_name("Kanak_Thakur");

		AdminService adminService = new AdminService();
		adminService.update(admin);
	}
}
