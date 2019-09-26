package com.gyc.structural.bridge;

public abstract class Test implements Account {
    public static void main(String[] args) {
        Bank icbBank = new ICBCBank(new DepositAccount());
        Account icbAccount =icbBank.openAccount();
        icbAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

    }
}
