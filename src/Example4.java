public class Example4 {
    public static void main(String... args) {
        var storage1 = new Storage<BankAccount>();
        storage1.setItem(new SavingsAccount(2024, 3));
        process(storage1);

        var storage2 = new Storage<SavingsAccount>();
        storage2.setItem(new SavingsAccount(2025, 2));
        process(storage2);
    }

    public static void process(Storage<? extends BankAccount> s) {
        BankAccount a = s.getItem(); // s is a "producer" of BankAccounts
        System.out.println("Account " + a.getAccountNumber());
    }
}
