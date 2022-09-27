package Model;

import java.io.Serializable;

public class Customer implements Serializable, Comparable<Customer> {

    private String customerId;
    private String customerName;
    private String customerAreaCode;
    private Integer numberOfUnitsConsumed;
    private Double totalBill;

    public Customer(String customerId, String customerName, String customerAreaCode, Integer numberOfUnitsConsumed, Double totalBill) {
        setCustomerId(customerId);
        setCustomerName(customerName);
        setCustomerAreaCode(customerAreaCode);
        setNumberOfUnitsConsumed(numberOfUnitsConsumed);
        setTotalBill(totalBill);
    }

    public String getCustomerId() {
        return customerId;
    }

    private void setCustomerId(String customerId) {

        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }


    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAreaCode() {
        return customerAreaCode;
    }

    private void setCustomerAreaCode(String customerAreaCode) {
        this.customerAreaCode = customerAreaCode;
    }

    public Integer getNumberOfUnitsConsumed() {
        return numberOfUnitsConsumed;
    }

    private void setNumberOfUnitsConsumed(Integer numberOfUnitsConsumed) {
        this.numberOfUnitsConsumed = numberOfUnitsConsumed;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    private void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAreaCode='" + customerAreaCode + '\'' +
                ", numberOfUnitsConsumed=" + numberOfUnitsConsumed +
                ", totalBill=" + totalBill +
                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return this.getCustomerId().compareTo(customer.getCustomerId());
    }

}






//    public void writeObject(ObjectOutputStream oos) throws IOException {
////        System.out.println("Calling object");
//        oos.defaultWriteObject();
//    }
//
//    public static void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
////        System.out.println("alling object");
//        ois.defaultReadObject();
//    }
//
//import Exceptions.InvalidNameException;
//        import Service.CustomerUtility;
//
//        import java.io.IOException;
//        import java.io.ObjectInputStream;
//        import java.io.ObjectOutputStream;