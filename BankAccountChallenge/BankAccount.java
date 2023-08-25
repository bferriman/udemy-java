package BankAccountChallenge;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    // getters

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    // setters

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    // methods

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
            }
        }
    }
}