package com.codingblocks.lec3;

public class pattern {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int cnt=1;
        while(row<=n){
            int col=1;
            while(col<=row){
                System.out.print(cnt+" ");
                col=col+1;
                cnt=cnt+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
