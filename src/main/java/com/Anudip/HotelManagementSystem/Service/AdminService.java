package com.Anudip.HotelManagementSystem.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Anudip.HotelManagementSystem.Dao.AdminDao;
import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Model.LandLord;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	LandlordService landlordService = new LandlordService();

	public void create(Admin admin) {
		adminDao.create(admin);
	}

	public void update(Admin admin) {
		adminDao.update(admin);
	}

	public void delete(int id) {
		Admin admin = adminDao.readById(id);

		for (LandLord landLord : admin.getLandLords()) {
			landlordService.delete(landLord.getId());
		}
		adminDao.delete(id);
	}

	public Admin readById(int id) {
		return adminDao.readById(id);
	}

	public List<Admin> readAllAdmin() {
		return adminDao.readAllAdmin();
	}

	public List<LandLord> readAllUnapprovedLandlords() {
		List<LandLord> landLords = landlordService.readAllLandlord();
		List<LandLord> landLords2 = new ArrayList<LandLord>();

		for (LandLord landLord : landLords) {
			if (landLord.getStatus().equalsIgnoreCase("Not Approved")) {
				landLords2.add(landLord);
			}
		}
		return landLords2;
	}

	
	public void approveLandlordById(int id, Admin admin) {
	    LandLord landLord = landlordService.readById(id);
	    if (landLord != null) {
	        landLord.setAdmin(admin);
	        landLord.setStatus("APPROVED");
	        
	        admin.setLandLords(Collections.singletonList(landLord));
              
	        landlordService.update(landLord);
	        adminDao.update(admin);
	        
	    } else {
	        System.out.println("Landlord with ID " + id + " not found.");
	    }
	}
	public List<LandLord> readAllApprovedLandlords() {
		List<LandLord> landLords = landlordService.readAllLandlord();
		List<LandLord> landLords2 = new ArrayList<LandLord>();

		for (LandLord landLord : landLords) {
			if (landLord.getStatus().equalsIgnoreCase("Approved")) {
				landLords2.add(landLord);
			}
		}
		return landLords2;
	}


}
