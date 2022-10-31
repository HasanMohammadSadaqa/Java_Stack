public class Test{
    public static void main(String[] args) {
        //making an objects
        BankAccount customer1 = new BankAccount(500, 500);
        BankAccount customer2 = new BankAccount(20, 1500);
        BankAccount customer3 = new BankAccount(3600, 0);

        //get amount in any account
        System.out.println(customer1.getCheckingBalance()); 
        System.out.println(customer2.getSavingBalance()); 

        //test deposit method
        customer1.deposit(500, "checking account");
        customer2.deposit(500, "saving account");

        //get again  just To make sure everything is going well
        System.out.println(customer1.getCheckingBalance()); 
        System.out.println(customer2.getSavingBalance());

        //test withdrow 
        customer1.withdrow(500, "checking account");
        customer2.withdrow(500, "saving account");
        customer3.withdrow(4000, "checking account");

        //get again  just To make sure everything is going well
        System.out.println(customer1.getCheckingBalance()); 
        System.out.println(customer2.getSavingBalance());

        //test display method
        customer1.display();
        customer2.display();
    }
}