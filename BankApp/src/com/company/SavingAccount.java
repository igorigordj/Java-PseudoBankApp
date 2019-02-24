package com.company;

public class SavingAccount extends Account {

   private int safetyDepositBoxId;
   private int safetyDepositBoxKey;

    public SavingAccount(String name, String jmbg, double balance, int safetyDepositBoxId, int safetyDepositBoxKey) {
        super(name, jmbg, balance);

        accountNumber = "1" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);

        setSafetyDepositBox();
    }

    public void setRate(){
        interestRate = getBaseInterestRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
        //System.out.println(safetyDepositBoxId);

        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
        //System.out.println(safetyDepositBoxKey);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
