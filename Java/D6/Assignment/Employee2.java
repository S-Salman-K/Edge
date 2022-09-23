package Assignment;

import java.util.Arrays;

class Employee2 {
    private int empId;
    private String empName;
    private Address[] addresses;

    public Employee2(int empId, String empName, Address[] addresses) {
        this.empId = empId;
        this.empName = empName;
        this.addresses = addresses;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Employee Data{ " +
                "\nempId=" + empId +
                "\nempName=" + empName +
                "\naddresses=" + Arrays.toString(addresses) +
                "\n";
    }
}

//    Create the Employee class, which should contain the
//    attributes:
//    empId,
//    empName.
//    empAddresses, which is array of address. This should consist of temporary address and permanent address.
//        Write a program to instantiate the employee object and display all the
//        attributes of the same.
//        Attributes of address class: flatNumber, flatName, roadName, cityName.
