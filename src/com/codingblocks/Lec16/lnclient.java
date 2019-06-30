package com.codingblocks.Lec16;


import java.util.LinkedList;
import java.util.Queue;

public class lnclient {
    public static void main(String[] args) {


        Linkedlist list = new Linkedlist();
//        LinkedList list1= new LinkedList();
        Linkedlist list1 =new Linkedlist();
        Linkedlist list2 =new Linkedlist();


        list1.insertlast(1);
        list1.insertlast(5);
        list1.insertlast(9);
        list2.insertlast(2);
        list2.insertlast(3);
        list2.insertlast(4);
        list2.insertlast(10);

        Linkedlist list3=list.merge(list1,list2);
        list3.display();
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.display();
//        list.insert(2,20);
//    System.out.println(list.find(21));
//        System.out.println(list.find(20));
//        System.out.println(list.find(14));
////        list.display();
//        list.duplicates();
//        list.display();
    }
}