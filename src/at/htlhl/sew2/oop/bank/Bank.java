package at.htlhl.sew2.oop.bank;

public class Bank {
    void main() {
        BankAccount ba1 = new BankAccount();
        ba1.id = 1;
        ba1.balance = 134.54f;
        ba1.owner = "Max Mustermann";

        IO.println("Konto 1 Eigentümer: " + ba1.owner);

        BankAccount ba2 = new BankAccount();
        ba2.id = 2;
        ba2.balance = -442.22f;
        ba2.owner = "Herbert Herbst";

        IO.println("BA2 Kontostand: " + ba2.balance);
        ba2.deposit(500f);
        IO.println("BA2 Kontostand: " + ba2.balance);
    }
}
