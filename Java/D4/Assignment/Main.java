package Assignment;

//        Create at-least 3 bank accounts using parameterized constructor.
//        Invoke the withdrawAmount() and depositAmount() method randomly for different accounts.
//        Display the details of each account after transaction.
//        Also show the current cash available in the bank. (Use the totalBalance to know the current cash available in the bank)
//        IMP: Apply the validations for openingBalance and withDrawAmount
//        openingBalance should be positive number
//        You should not be able to withdraw the amount that the current balance.

import org.w3c.dom.ls.LSOutput;

public class Main {
//    public BankAccount(int accountId, String accountHolderName, double openingBalance, double currentBalance, double totalBalance) {

        public static void main(String[] args) throws AccountBalanceBelowMinimumException {
                BankAccount ac101 = new BankAccount("BNAC20220001", "Jon Doe", 4000, "savings");
                System.out.println(ac101);
                ac101.depositAmount(2500);
                System.out.println(ac101);
                ac101.withdrawAmount(1000);
                System.out.println(ac101);
                ac101.withdrawAmount(2000);
                System.out.println(ac101);

                BankAccount ac102 = new BankAccount("BNAC20220002", "Jake Doe", 3000, "current");
                System.out.println(ac102);
                ac102.depositAmount(2000);
                System.out.println(ac102);
                ac102.withdrawAmount(1500);
                System.out.println(ac102);
                ac102.withdrawAmount(1000);
                ac102.withdrawAmount(500);
//                ac102.withdrawAmount(1);
                System.out.println(ac102);

                BankAccount ac103 = new BankAccount("BNAC20220002", "Joe Doe", 400, "savings");
                System.out.println(ac103);

                System.out.println(BankAccount.getTotalBalance());
        }
}
