package org.example;

import Service.CustomerUtility;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        CustomerUtility customerUtility = new CustomerUtility();

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome------------");

        while (true) {
            System.out.println("Press 1 to add new Customer");
            System.out.println("Press 2 to display all the customers with their bill, with all the other details.");
            System.out.println("Press 3 to display the customers sorted in the descending order of their bill.");
            System.out.println("Press 4 to display the details of the customers in the given customerAreaCode.");
            System.out.println("Press 0 exit.");
            System.out.print("Enter your choice: ");
            String choice = sc.next();
            sc.nextLine();
            switch (choice) {
                case "0":
                    break;
                case "1":
                    customerUtility.addCustomer();
                    break;
                case "2":
                    customerUtility.displayCustomersAndBill();
                    break;
                case "3":
                    customerUtility.displayCustomersOrderedByBill();
                    break;
                case "4":
                    customerUtility.displayCustomersByAreaCode();
                    break;
                default:
                    System.out.println("Wrong Choice! Try between (0-4)");
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            if (choice.equals("0"))
                break;
        }
        System.out.println("Program Terminated");
        customerUtility.serialize();

//        deserialization
//        CustomerUtility abc = CustomerUtility.deserialize();
//        abc.addCustomer(new Customer("c101", "Billy", "61", 154, 234D));
//        abc.displayCustomersAndBill();
    }
}