package com.codingblocks.lect11;

import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
        int ar[]={5,4,3,2,1};
        quick(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));

    }

    public static void quick(int ar[],int start, int end){

        if(end<=start){
            return;
        }

       int pivot= end-1;

        pivot=pivotadjust(ar,start,pivot);

        quick(ar,start,pivot);
        quick(ar,pivot+1,end);

    }

    private static int pivotadjust(int[] ar, int start, int pivot) {

       int i=start;
       int j=start;

        for (i = start; i<pivot ; i++) {
            if(ar[i]<ar[pivot]){
                int t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
                j++;
            }
        }

        int t=ar[j];
        ar[j]=ar[pivot];
        ar[pivot]=t;

        return j;

    }
}
