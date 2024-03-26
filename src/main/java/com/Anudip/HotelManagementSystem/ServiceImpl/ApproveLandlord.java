package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Service.AdminService;

public class ApproveLandlord {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		int Landlord_id = 1;
		int adminId = 1;
		
		Admin admin = new Admin();
		admin.setAdmin_id(adminId);
		
		
		
		
		
		adminService.approveLandlordById(Landlord_id, admin);
	}
}
