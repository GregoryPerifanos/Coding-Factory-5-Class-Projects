package gr.aueb.cf.ch11;

public class AccountApp {
    public static void main(String[] args) throws Exception {
        Account alice = new Account(1, "GR123", "Alice", "W.", "A103", 1000);
        Account bob = new Account(2, "GR1234", "Bob", "D.", "B100", 1000);

        try {
            alice.deposit(400.50);
            System.out.println("Successful deposit");

            bob.withdraw(300, "B100");
            System.out.println("Successful Withdraw");

            System.out.println(alice.accountToString());
            System.out.println(bob.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
