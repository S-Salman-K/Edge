package Service;

import Model.Customer;

import java.io.*;
import java.util.*;

public class CustomerUtility implements Serializable {
    static private Scanner sc;
    static private List<Customer> customers;
    static private Map<String, List<Customer>> customerAreaMap;

    public CustomerUtility() {
        sc = new Scanner(System.in);
        customers = new ArrayList<>();
        customerAreaMap = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void addCustomer() {
        String customerId = null;
        while (customerId == null) {
            System.out.print("ID: ");
            customerId = sc.next();
            if (isValidId(customerId)) {
                sc.nextLine();
                break;
            }
            customerId = null;
        }

        String customerName = null;
        while (customerName == null) {
            System.out.print("Name: ");
            customerName = sc.nextLine();
            if (isValidName(customerName)) {
                break;
            } else {
//                try {
//                    throw new InvalidNameException("Name should contain only alphabets!");
//                } catch (InvalidNameException exception) {
//                    exception.printStackTrace();
//                }
                System.out.println("Name should contain only alphabets!");
            }
            customerName = null;
        }


        String customerAreaCode = null;
        while (customerAreaCode == null) {
            System.out.print("Area Code: ");
            customerAreaCode = sc.next();
            if (isValidCode(customerAreaCode)) {
                break;
            }
            System.out.println("Please enter positive numbers only!");
            customerAreaCode = null;
        }

        Integer numberOfUnitsConsumed = null;
        while (numberOfUnitsConsumed == null) {
            try {
                System.out.print("Units Consumed: ");
                numberOfUnitsConsumed = sc.nextInt();
                if (numberOfUnitsConsumed < 0)
                    throw new Exception();
                break;
            } catch (Exception exception) {
                System.out.println("Number of Units should be Integer and positive!");
            }
            sc.nextLine();
            numberOfUnitsConsumed = null;
        }

        Double totalBill = getTotalBill(numberOfUnitsConsumed);
        Customer newCustomer = new Customer(customerId, customerName, customerAreaCode, numberOfUnitsConsumed, totalBill);
        customers.add(newCustomer);

        List<Customer> customersByArea;
        if (customerAreaMap.containsKey(customerAreaCode))
            customersByArea = customerAreaMap.get(customerAreaCode);
        else
            customersByArea = new ArrayList<>();
        customersByArea.add(newCustomer);
        customerAreaMap.put(customerAreaCode, customersByArea);
        System.out.println("Customer Added Successfully.");
    }

    public void displayCustomersAndBill() {
        if (customers.size() == 0) {
            System.out.println("No Customer Details Available!");
        } else {
            for (Customer customer : customers)
                System.out.println(customer);
        }
    }

    public void displayCustomersOrderedByBill() {
        if (customers.size() == 0) {
            System.out.println("No Customer Details Available!");
        } else {
            customers.sort((c1, c2) -> (int) (c2.getTotalBill() - c1.getTotalBill()));
            this.displayCustomersAndBill();
        }
    }

    public void displayCustomersByAreaCode() {
        String areaCode = null;
        while (areaCode == null) {
            System.out.print("Area Code: ");
            areaCode = sc.next();
            if (isValidCode(areaCode)) {
                break;
            }

            areaCode = null;
        }
        if (customerAreaMap.containsKey(areaCode)) {
            System.out.println("Customers in area code " + areaCode + " are: ");
            for (Customer customer : customerAreaMap.get(areaCode))
                System.out.println(customer);
        } else {
            System.out.println("No customers available in area: " + areaCode);
        }

    }


    // validation functions
    private static boolean isValidName(String name) {
        String expression = "^[a-zA-Z\\s]+";
        return name.matches(expression);
    }


    private static boolean isValidId(String customerID) {
        for (char e : customerID.toCharArray()) {
            if (!Character.isLetter(e) && !Character.isDigit(e)) {
                System.out.println("Please enter Letters and Numbers only!");
                return false;
            }
        }
        for (Customer customer : customers) {
            if (customer.getCustomerId().equalsIgnoreCase(customerID)) {
                System.out.println("Customer with this ID already present!");
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCode(String customerAreaCode) {
        for (char e : customerAreaCode.toCharArray()) {
            if (!Character.isDigit(e))
                return false;
        }
        if (Integer.parseInt(customerAreaCode) < 0)
            return false;
        return true;
    }

    private double getTotalBill(int numberOfUnitsConsumed) {
        double bill = 0;
        if (numberOfUnitsConsumed <= 100) {
            bill = numberOfUnitsConsumed * 0.5;
        } else if (numberOfUnitsConsumed <= 150) {
            bill = 100 * 0.5 + (numberOfUnitsConsumed - 100) * 0.75;
        } else {
            bill = 100 * 0.5 + 50 * 0.75 + (numberOfUnitsConsumed - 150);
        }
        return bill;
    }

    public void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream("elec.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.writeObject(customers);
        System.out.println("Object Serialized");
        oos.close();
        fos.close();
    }

    public static CustomerUtility deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("elec.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        CustomerUtility cu = (CustomerUtility) ois.readObject();
        List<Customer> list = (List<Customer>) ois.readObject();
        cu.customers = list;
        ois.close();
        fis.close();
        return cu;
    }

}
