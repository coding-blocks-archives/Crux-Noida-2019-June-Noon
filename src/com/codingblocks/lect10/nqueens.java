package com.codingblocks.lect10;

public class nqueens {

    public static void main(String[] args) {

        int n=4;
        boolean board[][]= new boolean[n][n];

        //boolean array is initialised with false by default
//        for (int i = 0; i <board.length ; i++) {
//            for (int j = 0; j <board[i].length ; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
        nqueens(board,0);
    }
    public static void nqueens(boolean board[][] ,int row){

        if(row==board.length){
            display(board);
            return;
        }
        for (int col = 0; col <board.length ; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                nqueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean issafe(boolean[][] board, int row, int col) {

        //vertical

        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //left diag
        int left=Math.min(row,col);
        for (int i = 1; i <=left ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        //right diagonal

        int right=Math.min(row,board.length-col-1);
        for (int i = 1; i <=right ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

    return true;
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
