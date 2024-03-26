package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Service.AdminService;

public class DeleteAdmin {
	public static void main(String[] args) {
		int admin_id = 1;

		AdminService adminService = new AdminService();
		adminService.delete(admin_id);
	}
}
