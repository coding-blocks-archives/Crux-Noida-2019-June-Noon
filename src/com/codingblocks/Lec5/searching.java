package com.codingblocks.Lec5;

public class searching {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};
        System.out.println(binary(ar,3));
    }

    public static int linearsearch(int ar[],int item){

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==item){
                return i;
            }
        }
        return -1;
    }

    public static int binary( int[] ar, int element){

     int start=0;
     int end=ar.length-1;

     while(start<=end){
         int mid=(start+end)/2;

         if(ar[mid]==element){
             return mid;
         }
         else if(ar[mid]<element){
             start=mid+1;
         }
         else{
             end=mid-1;
         }
     }
        return -1;
    }
}
