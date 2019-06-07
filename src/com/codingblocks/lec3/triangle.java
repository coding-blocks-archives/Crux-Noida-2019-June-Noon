package com.codingblocks.lec3;

public class triangle {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int vmir=1;
        while(vmir<=2*n-1){
            int col=1;
            int space=1;
            while(space<=n-row){
                System.out.print(" ");
                space=space+1;
            }

            while(col<=2*row-1){
                System.out.print("*");
                col=col+1;
            }
            System.out.println();

            if(vmir<n) {
                row = row + 1;
            }
            else{
                row= row-1;
            }
            vmir=vmir+1;
        }
    }
}
