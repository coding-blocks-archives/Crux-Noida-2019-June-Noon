package com.codingblocks.Lec6;

import java.util.ArrayList;

public class alist {


    public static void main(String[] args) {


             int a=4;
        Integer i=new Integer(a);


        ArrayList ar= new ArrayList();


        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.set(2,99);
        for (int j = 0; j <ar.size() ; j++) {

            System.out.println(ar.get(j));
        }
        System.out.println(ar.indexOf(99));


    }
}
