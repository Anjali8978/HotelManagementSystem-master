package com.Anudip.HotelManagementSystem.Usecase;

import com.Anudip.HotelManagementSystem.Model.Admin;
import com.Anudip.HotelManagementSystem.Model.Customer;
import com.Anudip.HotelManagementSystem.Model.Hotel;
import com.Anudip.HotelManagementSystem.Model.LandLord;
import com.Anudip.HotelManagementSystem.Model.Room;
import com.Anudip.HotelManagementSystem.Service.AdminService;
import com.Anudip.HotelManagementSystem.Service.CustomerService;
import com.Anudip.HotelManagementSystem.Service.HotelService;
import com.Anudip.HotelManagementSystem.Service.LandlordService;
import com.Anudip.HotelManagementSystem.Service.RoomService;
import com.Anudip.HotelManagementSystem.ServiceImpl.ApproveLandlord;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminService adminService = new AdminService();
        CustomerService customerService = new CustomerService();
        HotelService hotelService = new HotelService();
        LandlordService landlordService = new LandlordService();
        RoomService roomService = new RoomService();
        
        LandLord landlord = new LandLord();
        landlord.setName("Mr.Smith");
        landlord.setAddress("123 Main Street");
        landlord.setStatus("Approved");
        
        Admin admin = new Admin();
        admin.setAdmin_name("Kanak");
        admin.setEmail_id("thakurkanak02@gmail.com");
        adminService.create(admin);

        landlord.setAdmin(admin);
        landlordService.create(landlord);
        
        while (true) {
            System.out.println("Welcome to Hotel Management System");
            System.out.println("1. Add Admin");
            System.out.println("2. Add Customer");
            System.out.println("3. Add Hotel");
            System.out.println("4. Add Room");
            System.out.println("5. List all Admins");
            System.out.println("6. List all Customers");
            System.out.println("7. List all Hotels");
            System.out.println("8. List all Landlords");
            System.out.println("9. List all Rooms");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You selected: Add Admin");
                    System.out.print("Enter admin name: ");
                    String adminName = scanner.next();
                    System.out.print("Enter admin email: ");
                    String adminEmail = scanner.next();

                    // Create an admin object with the input details
                    
                    admin.setAdmin_name(adminName);
                    admin.setEmail_id(adminEmail);

                    
                    adminService.create(admin);
                    break;
                    
                case 2:
                    System.out.println("You selected: Add Customer");
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter customer phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter customer Aadhar number: ");
                    String aadharNumber = scanner.next();

                    // Create a customer object with the input details
                    Customer customer = new Customer();
                    customer.setCustomer_name(customerName);
                    customer.setCustomer_phnone_num(phoneNumber);
                    customer.setCustomer_aadhar_num(aadharNumber);

                    
                    customerService.create(customer);
                    break;
                    
                case 3:
                   
                    System.out.println("You selected: Add Hotel");
                    System.out.print("Enter hotel name: ");
                    scanner.nextLine();
                    String hotelName = scanner.next();
                    System.out.print("Enter hotel location: ");
                    String hotelLocation = scanner.next();
                    System.out.print("Enter number of rooms: ");
                    int numOfRooms = scanner.nextInt();
                    System.out.print("Enter hotel rating: ");
                    int rating = scanner.nextInt();

                    // Create a hotel object with the input details
                    Hotel hotel = new Hotel();
                    hotel.setLandLord(landlord);
                    hotel.setHotel_name(hotelName);
                    hotel.setHotel_location(hotelLocation);
                    hotel.setNum_of_rooms(numOfRooms);
                    hotel.setRating(rating);

                    
                    hotelService.create(hotel);
                    break;
                  
                case 4:
                    System.out.println("You selected: Add Room");
                   
                    System.out.print("Enter room price: ");
                    double roomPrice = scanner.nextDouble();
                    System.out.print("Enter room status: ");
                    String roomStatus = scanner.next();

                    
                    Room room = new Room();
                    room.setRoom_price(roomPrice);
                    room.setRoom_status(roomStatus);
                    
                    int customerId = 1; // Example customer ID
                    int hotelId = 1;
                    
                    
                    Customer customer1 =customerService.findCustomerById(1); // Retrieve customer by ID
                    Hotel hotel1 = hotelService.findHotelById(1); // Retrieve hotel by ID

                    room.setCustomer(customer1); // Set the associated customer
                    room.setHotel(hotel1);
                   
                    roomService.create(room);
                    break;
                    
                case 5:
                    System.out.println("You selected: List all Admins");
                    // Call method to list all admins
                    List<Admin> admins = adminService.readAllAdmin();
                    for (Admin admin1 : admins) {
                        System.out.println("Admin ID: " + admin1.getAdmin_id());
                        System.out.println("Admin Name: " + admin1.getAdmin_name());
                        System.out.println("Admin Email: " + admin1.getEmail_id());
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("You selected: List all Customers");
                    //method to list all customers
                    List<Customer> customers = customerService.readAllCustomer();
                    for (Customer customer11 : customers) {
                        System.out.println("Customer ID: " + customer11.getCustomer_id());
                        System.out.println("Customer Name: " + customer11.getCustomer_name());
                        System.out.println("Customer Phone Number: " + customer11.getCustomer_phnone_num());
                        System.out.println("Customer Aadhar Number: " + customer11.getCustomer_aadhar_num());
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("You selected: List all Hotels");
                    //method to list all hotels
                    List<Hotel> hotels = hotelService.readAllHotel();
                    for (Hotel hotel11 : hotels) {
                        System.out.println("Hotel ID: " + hotel11.getHotel_id());
                        System.out.println("Hotel Name: " + hotel11.getHotel_name());
                        System.out.println("Hotel Location: " + hotel11.getHotel_location());
                        System.out.println("Number of Rooms: " + hotel11.getNum_of_rooms());
                        System.out.println("Rating: " + hotel11.getRating());
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.println("You selected: List all Landlords");
                    // method to list all landlords
                    List<LandLord> landlords = landlordService.readAllLandlord();
                    for (LandLord landlord1 : landlords) {
                        System.out.println("Landlord ID: " + landlord1.getId());
                        System.out.println("Name: " + landlord1.getName());
                        System.out.println("Address: " + landlord1.getAddress());
                        System.out.println("Status: " + landlord1.getStatus());
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println("You selected: List all Rooms");
                    // method to list all rooms
                    List<Room> rooms = roomService.readAllRooms();
                    for (Room room1 : rooms) {
                        System.out.println("Room ID: " + room1.getRoom_id());
                        System.out.println("Price: " + room1.getRoom_price());
                        System.out.println("Status: " + room1.getRoom_status());
                        System.out.println("Hotel ID: " + room1.getHotel().getHotel_id());
                        System.out.println("Customer ID: " + (room1.getCustomer() != null ? room1.getCustomer().getCustomer_id() : "Not booked"));
                        System.out.println();
                    }
                    break;
                
                
                	
     
                
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; 
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

