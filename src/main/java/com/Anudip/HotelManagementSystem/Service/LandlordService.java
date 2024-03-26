package com.Anudip.HotelManagementSystem.Service;

import java.util.ArrayList;
import java.util.List;

import com.Anudip.HotelManagementSystem.Dao.LandlordDao;
import com.Anudip.HotelManagementSystem.Model.Hotel;
import com.Anudip.HotelManagementSystem.Model.LandLord;

public class LandlordService {
      
	LandlordDao landlordDao = new LandlordDao();
	HotelService hotelService = new HotelService();

	public void create(LandLord landLord) {
		landLord.setStatus("Approved");
		landlordDao.create(landLord);
	}

	public void update(LandLord landLord) {
		landlordDao.update(landLord);
	}

	public void delete(int id) {
		LandLord landLord = landlordDao.readById(id);
		for (Hotel hotel : landLord.getHotels()) {
			hotelService.delete(hotel.getHotel_id());
		}
		landlordDao.delete(id);
	}

	public LandLord readById(int id) {
		return landlordDao.readById(id);
	}

	public List<LandLord> readAllLandlord() {
		return landlordDao.readAllLandlord();
	}

	public void addHotelById(int id, LandLord landLord) {
		LandLord landLord1 = landlordDao.readById(landLord.getId());
		if (landLord1.getStatus().equalsIgnoreCase("APPROVED")) {
			Hotel hotel = hotelService.readById(id);
			hotel.setLandLord(landLord1);

			ArrayList<Hotel> hotels = new ArrayList<Hotel>();
			hotels.add(hotel);

			landLord1.setHotels(hotels);

			landlordDao.update(landLord1);
			hotelService.update(hotel);

		} else {
			System.out.println("LandLord is not approved");
		}
	}
}
