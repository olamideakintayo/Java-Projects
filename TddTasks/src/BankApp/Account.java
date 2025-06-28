package BankApp;

public class Account {
    private int balance;
    private String pin;

    public void setPin(String pin) {
        this.pin = pin;
    }
   
    public int getBalance(String pin) {
        if(this.pin.equals(pin)) {
            return balance;
        }
        return 0;
    }

    public int deposit(int amount) {
        if (amount > 0) return balance += amount;
        return 0;
    }

    public int withdraw(int amount, String pin) {
        if (amount > 0 && amount <= balance && this.pin.equals(pin)) {
            balance -= amount;
            return balance;
        }
        return 0;
    }
}
