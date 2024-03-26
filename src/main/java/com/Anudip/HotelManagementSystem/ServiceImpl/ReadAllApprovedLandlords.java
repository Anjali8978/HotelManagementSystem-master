package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.List;

import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Service.AdminService;

public class ReadAllApprovedLandlords {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<LandLord> landLords = adminService.readAllApprovedLandlords();
		for (LandLord landLord : landLords) {
			System.out.println(landLord.getId());
			System.out.println(landLord.getName());
			System.out.println(landLord.getAddress());
			System.out.println(landLord.getStatus());
			System.out.println();
		}
	}
}
