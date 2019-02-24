package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      // testClass();

        readerTest();

    }

    public static void readerTest(){
        String file = "D:\\PROJECTS\\Java\\BankApp\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = CSV.readFile(file);

        for (String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String jmbg = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + "," + jmbg + "," + accountType + ",$" + initDeposit);
            System.out.println("*********************************");

        }
    }

    public static void testClass(){
      /*  Account user1 = new SavingAccount("Igi Lav", "0101991750055",
                1500, 31,654);
        // user1.showInfo();

        //System.out.println("***********************************");

        Account user2 = new CheckingAccount("Miss Piggy", "0506997651065", 2500);
        // user2.showInfo();

        System.out.println("***********************************");
        */

        // TRANSFER METHOD TEST
      /*  user1.tranfer(user1, user2, 1000);

        System.out.println("***********************************");

        user1.showInfo();
        System.out.println("***********************************");
        user2.showInfo(); */

        //DEPOSIT METHOD TEST
       /* user1.showInfo();
        System.out.println("***********************************");
        user1.deposit(2500);
        System.out.println("***********************************");

        user1.showInfo(); */

        //WITHDRAW METHOD TEST
       /* user2.showInfo();
        System.out.println("***********************************");
        user2.withdraw(1500);
        System.out.println("***********************************");

        user2.showInfo(); */

        //COMPOUND METHOD TEST
     /*   user1.showInfo();
        System.out.println("***********************************");
        user1.compound();
        System.out.println("***********************************");

        user1.showInfo();
        */
    }
}
