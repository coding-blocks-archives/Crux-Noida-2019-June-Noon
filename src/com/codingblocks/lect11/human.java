package com.codingblocks.lect11;

public class human {

    String name;
    int balance;

    static int population=0;

    public human(){

        this(1000);
    }


    public human(int balance){
        this(balance,"Anonymous");
    }

    public human(int balance,String name){
        this.balance=balance;
        this.name=name;
        System.out.println("paida ho gya");
        population++;
    }

    public int loan(){

        int t=this.balance/10;
        balance=balance-t;
        System.out.println(name +" yaar gareeb ho rha hun "+balance);
        return t;
    }

    public void eat(){
        System.out.println("Iam eating");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("banda mar gya");
        population--;
    }
}
