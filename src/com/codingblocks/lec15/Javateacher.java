package com.codingblocks.lec15;

public class Javateacher implements Teacher {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void teach() {
        System.out.println("Java padhata hun");
    }

    @Override
    public void study() {
        System.out.println("padhta hun kuch");
    }

    public void dance(){
        System.out.println("I dance in java");
    }
}
