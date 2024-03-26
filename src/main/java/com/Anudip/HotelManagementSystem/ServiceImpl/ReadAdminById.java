package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Service.AdminService;

public class ReadAdminById {
	public static void main(String[] args) {

		int admin_id = 1;
		AdminService adminService = new AdminService();

		Admin admin = adminService.readById(admin_id);

		System.out.println(admin.getAdmin_id());
		System.out.println(admin.getAdmin_name());
		System.out.println(admin.getEmail_id());
	}
}
