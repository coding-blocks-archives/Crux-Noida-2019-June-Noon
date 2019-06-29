package com.codingblocks.Lec16;



public class lnclient {
    public static void main(String[] args) {


        Linkedlist list = new Linkedlist();
             list.insertfirst(12);
        list.insertfirst(14);
        list.insertfirst(14);
        list.insertfirst(14);
        list.insertlast(16);
        list.insertlast(17);
        list.insertlast(17);
        list.insertlast(17);
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.display();
//        list.insert(2,20);
//        System.out.println(list.find(20));
//        list.display();
        list.duplicates();
        list.display();
    }
}