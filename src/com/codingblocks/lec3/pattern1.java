package com.codingblocks.lec3;

public class pattern1 {
    public static void main(String[] args) {
        int n=4;
        int row=1;
       // int cnt=1;
        while(row<=n){
            int col=1;
            while(col<=row){

                if(col==1 ||row==col) {
                    System.out.print(row + " ");
                }
                else{
                    System.out.print("0 ");
                }

                //cnt=cnt+1;
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
