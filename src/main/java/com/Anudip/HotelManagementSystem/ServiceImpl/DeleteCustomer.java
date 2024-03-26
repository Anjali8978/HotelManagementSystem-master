package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Service.CustomerService;

public class DeleteCustomer {
	public static void main(String[] args) {
		int customer_id = 4;
		CustomerService customerService = new CustomerService();
		customerService.delete(customer_id);

	}
}
