package com.Anudip.HotelManagementSystem.ServiceImpl;

import com.Anudip.HotelManagementSystem.Model.Customer;
import com.Anudip.HotelManagementSystem.Service.CustomerService;

public class SaveCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_name("pari");
		customer.setCustomer_phnone_num("9887755442");
		customer.setCustomer_aadhar_num("515231112725");
		CustomerService customerService = new CustomerService();
		customerService.create(customer);
	}
}
