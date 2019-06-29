package com.codingblocks.Lec16;


import java.util.LinkedList;
import java.util.Queue;

public class lnclient {
    public static void main(String[] args) {


        Linkedlist list = new Linkedlist();
        LinkedList list1= new LinkedList();

        list.insertfirst(14);
        list.insertfirst(20);
        list.insertfirst(21);
        list.insertlast(16);
        list.insertlast(17);
        list.insertlast(17);
        list.insertlast(17);
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.display();
//        list.insert(2,20);
    System.out.println(list.find(21));
        System.out.println(list.find(20));
        System.out.println(list.find(14));
//        list.display();
        list.duplicates();
        list.display();
    }
}