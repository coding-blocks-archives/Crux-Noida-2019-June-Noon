package com.codingblocks.lect13;

public  class PetrolEngine extends Engine{

    public void start(){
        System.out.println("petrol engine starting");
         }

    @Override
    public void stop() {
        System.out.println("petrol engine stop");
    }



    public void makenoise(){
        System.out.println(" burrrrrrrrrrrrrrrr");
    }

    public void gear(int a){
        System.out.println("gear");
    }

    public void gear(int a,float b){
        System.out.println("Advanced");
    }

}
