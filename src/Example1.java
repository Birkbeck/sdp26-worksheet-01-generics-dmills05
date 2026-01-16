public class Example1 {
    public static void main(String... args) {

//        Storage<BankAccount> bankAccountStorage = new Storage<BankAccount>();
//        Storage<String> stringStorage = new Storage<String>();

//        Storage<BankAccount> bankAccountStorage = new Storage<>();
//        Storage<String> stringStorage = new Storage<>();

//        Object account = new BankAccount(2025);
//        bankAccountStorage.setItem(account);

        var bankAccountStorage = new Storage<>();
        var stringStorage = new Storage<>();

        BankAccount account = new BankAccount(2025);
        bankAccountStorage.setItem(account);

        Object account1 = bankAccountStorage.getItem();

//        account1.deposit(15); // deposit method doesn't exist in Object class
        ((BankAccount) account1).deposit(15);

    }
}
