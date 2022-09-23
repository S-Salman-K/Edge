package Assignment;

public class Employee2Main {
    public static void main(String[] args) {
        Address permanentAddress = new Address(102, "Castamere", "G.M. Road", "Kolkata");
        Address temporaryAddress = new Address(26, "Red Keep", "G.M. Road", "Goa");
        Address[] addresses = new Address[]{temporaryAddress, permanentAddress};
        Employee2 emp = new Employee2(1012022, "Syed Salman Khalid", addresses);

    }
}
