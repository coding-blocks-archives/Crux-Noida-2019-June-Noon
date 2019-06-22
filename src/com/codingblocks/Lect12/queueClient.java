package com.codingblocks.Lect12;

public class queueClient {

    public static void main(String[] args) {

        queue q= new queue();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
        System.out.println();
        try{
        System.out.println(q.remove());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        q.display();
    }
}
