package com.trimindtech.training.hw07;

public class BankAccount {
    private double initialAmount;
    protected double minBalance;
    protected double maxBalance;

    public BankAccount(double minBalance, double maxBalance) {
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
    }
    public BankAccount(Startup s){
        this.initialAmount = s.getInitialAmount();
        System.out.println(initialAmount);
    }
    public void debit(Debit d){
        if(d.getDebitedAmount()<this.minBalance){
            this.initialAmount = this.initialAmount - d.getDebitedAmount();
            System.out.println("the remaining balance"+this.initialAmount);
        }
        else{
            System.out.println("sorry, the amount is less than minimum balance sir");
        }
    }
    public void credit(Credit c){
        if((c.getCreditedAmount()<this.maxBalance)) {
            this.initialAmount = this.initialAmount + c.getCreditedAmount();
            System.out.println("total balance in your account" + this.initialAmount);
        }
        else{
            System.out.println("sorry, the amount is higher than maximum balance sir");
        }
    }
    public double getBalance(){
        return this.initialAmount;
    }
}
