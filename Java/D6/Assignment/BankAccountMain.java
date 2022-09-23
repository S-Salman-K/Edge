package Assignment;

public class BankAccountMain {
    public static void main(String[] args) {
        Bank_Account ac = new Bank_Account("SBI0082022", "Jon Doe", AccountType.SAVINGS);
        System.out.println(ac.calculateTotalInterest(1000, 3));
    }
}
