package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Customer;
import com.Anudip.HotelManagementSystem.Service.CustomerService;

public class UpdateCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_id(1);
		customer.setCustomer_name("Dolly");

		CustomerService customerService = new CustomerService();
		customerService.update(customer);
	}
}
