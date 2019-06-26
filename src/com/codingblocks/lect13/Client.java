package com.codingblocks.lect13;

public class Client {

    public static void main(String[] args) {
        PetrolEngine engine =(PetrolEngine)new Engine();
        System.out.println();
        engine.start();
        engine.stop();
        engine.accelerate();



//       engine.makenoise();

    }
}
