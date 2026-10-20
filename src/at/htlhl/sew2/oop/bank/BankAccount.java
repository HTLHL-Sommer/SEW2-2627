package at.htlhl.sew2.oop.bank;

public class BankAccount {
    int id; // account number
    float balance;
    String owner;

    void deposit(float amount) {
        balance += amount;
    }

    void withdraw(float amount) {
        if (balance - amount < 0) return;
        balance -= amount;
    }
}
