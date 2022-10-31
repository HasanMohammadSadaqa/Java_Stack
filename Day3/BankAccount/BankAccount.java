public class BankAccount{
    //data member
    private double checkingBalance;
    private double savingBalance ;
    static int accountNumber = 0;
    static double totalMoney = 0;

    //getter & setter
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }

    //Constructor
    BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        accountNumber ++;
    }

    //Methods
    //deposit method , i will take amount of value and add it to checking account or saving account
    public void deposit(double amount, String whichAccount){
        if (whichAccount == "saving account"){
            this.savingBalance += amount;
        }
        else if (whichAccount == "checking account"){
            this.checkingBalance += amount;
        }
        totalMoney+=amount;
    }

    //withdrow Method
    public void withdrow(double amount, String whichAccount){
        if (whichAccount == "saving account" && this.savingBalance >= amount){
            this.savingBalance -= amount;
        }
        else if (whichAccount == "checking account" && this.checkingBalance >= amount){
            this.checkingBalance -= amount;
        }
        else{
            System.out.println("Sorry, there is no enough in your Account!!");
        }
        totalMoney+=amount;
    }

    //display Method
    public void display(){
        System.out.println("your current balance in checking balance is: " + this.checkingBalance);
        System.out.println("your current balance in saving balance is: " + this.savingBalance);
    }
}