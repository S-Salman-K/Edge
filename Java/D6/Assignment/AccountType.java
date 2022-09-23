package Assignment;

public enum AccountType {
    SAVINGS(3.0f),
    CURRENT(3.5f);
    final float rate;

    AccountType(float rate) {
        this.rate = rate;
    }
}
