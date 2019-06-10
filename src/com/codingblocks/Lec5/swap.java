package com.codingblocks.Lec5;

import java.util.Arrays;

public class swap {

    public static void main(String[] args) {

        int ar[]={1,2,3,4};
            swap(ar);
        System.out.println(Arrays.toString(ar));
        reverse(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void swap(int ar[]){

        int temp=ar[0];
        ar[0]=ar[1];
        ar[1]=temp;

    }
    public static void swapar(int ar[],int start,int end){

        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;

    }

    public static void increase(int ar[]){
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=ar[i]+2;
        }

    }

    public static int maxindex(int ar[],int start,int end){
        int max=0;
        for (int i = start; i <=end; i++) {
            if(ar[i]>ar[max]){
                max=i;
            }
        }
    return max;
    }

    public static void reverse(int ar[]){

        for (int i = 0; i <ar.length/2 ; i++) {

            int temp=ar[i];
            ar[i]=ar[ar.length-i-1];
            ar[ar.length-i-1]=temp;
        }
    }



}
