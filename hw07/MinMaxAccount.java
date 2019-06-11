package com.trimindtech.training.hw07;

public class MinMaxAccount extends BankAccount {
    public MinMaxAccount(double minBalance, double maxBalance){
        super(minBalance, maxBalance);
    }
    public void minBalance(){
        System.out.println("min balance in your acconut"+super.minBalance);
    }
    public void maxBalance(){
        System.out.println("max balance in your account"+super.maxBalance);
    }
}
