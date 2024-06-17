public class ATMApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addUser(new User("user1", "1234", 1000.0));
        bank.addUser(new User("user2", "5678", 2000.0));

        ATM atm = new ATM(bank);
        atm.start();
    }
}

