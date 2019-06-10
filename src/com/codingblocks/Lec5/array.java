package com.codingblocks.Lec5;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int ar[]=new int[5];


        //initialized with no.
        int ar1[]={1,2,3,4,5};

        for (int i = 0; i <ar.length-1 ; i++) {

            ar[i]=s.nextInt();
        }

        System.out.println(ar[0]);

        for (int i = 0; i <ar.length ; i++) {

            System.out.println(ar[i]);

        }




    }

}
