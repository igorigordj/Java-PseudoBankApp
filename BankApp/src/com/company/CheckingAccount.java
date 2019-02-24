package com.company;

public class CheckingAccount extends Account {

   private int debitCardNumber;
   private int dCPin;

    public CheckingAccount(String name, String jmbg, double balance) {
        super(name, jmbg, balance);

        accountNumber = "2" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
       setDebitCard();

    }

    @Override
    public void setRate(){
        interestRate = getBaseInterestRate() * 0.15;
    }



    private void setDebitCard() {
        this.debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
       // System.out.println(debitCardNumber);
        this.dCPin = (int)(Math.random() * Math.pow(10, 4));
       // System.out.println(dCPin);
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }


}
