package BankAccountChallenge;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setBalance(1000);
        System.out.println("The starting balance is " + account.getBalance());
        account.deposit(250);
        account.withdraw(314.15);
        System.out.println("After deposit and withdrawal, the balance is " + account.getBalance());
        account.withdraw(1000);
        System.out.println("Final balance after withdrawal attempt with NSF is " + account.getBalance());

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Julio", "julio@ehohelle.com");
        VipCustomer vip3 = new VipCustomer("Miles", 20000.00, "kindof@blue.net");

        System.out.println("First VIP: " + vip1.getName() + " " + vip1.getCreditLimit() + " " + vip1.getEmail());
        System.out.println("Second VIP: " + vip2.getName() + " " + vip2.getCreditLimit() + " " + vip2.getEmail());
        System.out.println("Third VIP: " + vip3.getName() + " " + vip3.getCreditLimit() + " " + vip3.getEmail());
    }
}