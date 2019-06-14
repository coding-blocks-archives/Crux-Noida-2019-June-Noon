package com.codingblocks.lec8;

import java.util.Arrays;

public class recusrionques {

    public static void main(String[] args) {

        int ar[]={1,4,0,3,5};
//        System.out.println(findindex(ar,5,0));
//        System.out.println(sorted(ar,0));
//        pattern1(4,0);
        bubblesort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }


    public static boolean find(int ar[],int element,int index){

        if(index==ar.length){
            return false;
        }

        if(ar[index]==element){
            return true;
        }

        return find(ar,element,index+1);
    }

    public static int findindex(int ar[],int element,int index){

        if(index==ar.length){
            return -1;
        }

        if(ar[index]==element){
            return index;
        }

        return findindex(ar,element,index+1);
    }

    public static boolean sorted(int ar[],int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }

        return sorted(ar,index+1);
    }

    public static void pattern1(int row,int col){

        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            pattern1(row-1,0);
            return;
        }
        System.out.print("* ");
        pattern1(row,col+1);
    }

    public static void bubblesort(int ar[],int row,int col){

        if(row==0){
            return;
        }
        if(row==col){

            bubblesort(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            int temp=ar[col];
            ar[col]=ar[col+1];
            ar[col+1]=temp;
        }


        bubblesort(ar,row,col+1);
    }
}
