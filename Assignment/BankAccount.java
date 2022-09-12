package Assignment;

public class BankAccount {

    private String accountId;
    private String accountHolderName;
    private double openingBalance;
    private double currentBalance;
    static private double totalBalance;

    private AccountType accountType;

    enum AccountType {
        SAVINGS,
        CURRENT
    }


    static {
        totalBalance = 0;
    }

    public BankAccount(String accountId, String accountHolderName, double openingBalance, double currentBalance) throws AccountBalanceBelowMinimumException {
        setAccountId(accountId);
        setAccountHolderName(accountHolderName);
        setOpeningBalance(openingBalance);
        setCurrentBalance(currentBalance);
        setTotalBalance(currentBalance);
    }

    public BankAccount(String accountId, String accountHolderName, double currentBalance, String accountType) throws AccountBalanceBelowMinimumException {
        setAccountId(accountId);
        setAccountHolderName(accountHolderName);
        setAccountType(accountType);
        setCurrentBalance(currentBalance);
        setTotalBalance(currentBalance);
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (isValidName(accountHolderName))
            this.accountHolderName = accountHolderName;
        else {
            throw new InvalidNameException("Not a valid name");
        }
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        if (openingBalance < 0)
            throw new InvalidAmountException("Balance cannot be negative");
        this.openingBalance = openingBalance;
    }

    public void setCurrentBalance(double currentBalance) throws AccountBalanceBelowMinimumException {
        if (currentBalance < 0)
            throw new InvalidAmountException("Balance cannot be negative");
        if (currentBalance < this.openingBalance) {
            throw new AccountBalanceBelowMinimumException("Minimum " + this.openingBalance + " is required to open account.");
        }
        this.currentBalance = currentBalance;
    }

    static public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double currentBalance) throws AccountBalanceBelowMinimumException {
        this.totalBalance += currentBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("savings")) {
            this.accountType = AccountType.SAVINGS;
            setOpeningBalance(500);
        } else if (accountType.equalsIgnoreCase("current")) {
            this.accountType = AccountType.CURRENT;
            setOpeningBalance(1000);
        } else {
            throw new InvalidAccountTypeException("Not a valid account type.");
        }
    }

    public boolean depositAmount(double amount) {
        this.currentBalance += amount;
        this.totalBalance += amount;
        return true;
    }

    public boolean withdrawAmount(double amount) throws AccountBalanceBelowMinimumException {
        if (this.currentBalance - amount < this.openingBalance)
            throw new AccountBalanceBelowMinimumException("Can't withdraw as balance will go below Minimum required Balance");
        this.currentBalance -= amount;
        this.totalBalance -= amount;
        return true;
    }

    public double getCurrentBalance() {
        return this.totalBalance;
    }

    public void displayTotalBalance() {
        System.out.println("Balance: " + this.totalBalance);
    }


    private boolean isValidName(String name) {
        for (char e : name.toCharArray()) {
            if (!Character.isAlphabetic(e) && !Character.isWhitespace(e))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "\naccountId='" + accountId + '\'' +
                "\naccountHolderName='" + accountHolderName + '\'' +
                "\nopeningBalance=" + openingBalance +
                "\ncurrentBalance=" + currentBalance +
                "\naccountType=" + accountType +
                "}\n";
    }
}
