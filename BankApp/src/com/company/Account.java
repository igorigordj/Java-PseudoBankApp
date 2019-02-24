package com.company;

public abstract class Account implements IBaseInterestRate {

   private String name;
   private String jmbg;
   private double balance;

   protected String accountNumber;
   protected double interestRate;

   //BASE FOR CREATING UNIQUE 5 DIGIT NUMBER AS PART OF THE ACCOUNT NUMBER
   private static int index = 10000;

    public Account(String name, String jmbg, double balance) {
        this.name = name;
        this.jmbg = jmbg;
        this.balance = balance;

        index++;
        this.accountNumber = setAccountNumber();

        setRate();

    }



    public abstract void setRate();

    //GENERATE ACCOUNT NUMBER
    private String setAccountNumber(){
        String lastTwoDigitsOfJmbg = jmbg.substring(jmbg.length()-2, jmbg.length());
        int unique5DigitId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 2));

        return lastTwoDigitsOfJmbg + "-" + unique5DigitId + "-" + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (interestRate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
    }


    //BANKING OPERATIONS METHODS
    public void deposit(double amount){
        balance += amount;
        System.out.println("The amount of $" + amount + " is deposited.");
    }

    public void withdraw(double amount){
        if (balance - amount >= 0){
            balance -= amount;
            System.out.println("The amount of $" + amount + " is withdrawn.");
        }
        else {
            System.out.println("Insufficient founds!");
        }
    }

    public void tranfer(Account account1, Account account2, double amount){
        if (account1.balance - amount >=0){
            account1.balance -= amount;
            account2.balance += amount;
            System.out.println("Transfer proceeded");
        }
        else {
            System.out.println("Insufficient founds!\nTransfer is not possible");
        }

    }


    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nJMBG: " + jmbg +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nINTEREST RATE: %" + interestRate);
    }
}
