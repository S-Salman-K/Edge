package Assignment;

class Bank_Account {
    private String accountId;
    private String accountHolderName;
    private AccountType accountType;

    public Bank_Account(String accountId, String accountHolderName, AccountType accountType) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public double calculateTotalInterest(double amount, int years) {
        if (amount < 0)
            throw new DepositAmountException("Amount can't be negative");
        return amount * years * this.accountType.rate * 0.01;
    }

}

//
//Create the BankAccount with the following details:
//        Attributes: accountId, accountHolderName, AccountType
//        AccountType be enum contains the types SAVINGS and
//        CURRENT. The enum
//Should also provide the default interest rate for SAVINGS and
//        CURRENT account. That should be returned from one of the
//        methods from the enum
//Behaviour: BankAccount should have the method, calculateTotalInterest
//        as shown below:
//        calculateTotalInterest(double amount, int years)
//        The main class should create object of BankAccount and provide the
//        accounttype. It should  later invoke the calculateTotalInterest() by providing
//        arguments. Print the total interest on  investments.