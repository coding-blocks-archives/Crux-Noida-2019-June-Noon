package com.codingblocks.Lec6;

public class twodsample {
    public static void main(String[] args) {




int ar[][]=new int[3][3];

        int ar1[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        for (int i = 0; i <ar.length; i++) {
//            for (int j = 0; j <ar[i].length ; j++) {
//                System.out.print(ar[i][j]);
//            }
//            System.out.println();
//        }

             hwave(ar1);

    }

    public static void hwave(int ar[][]){

        for (int i = 0; i <ar.length ; i++) {

        if (i%2==0){

            for (int j = 0; j <ar[i].length ; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        else{
            for (int j = ar.length-1; j >=0; j--) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        }

    }

}
