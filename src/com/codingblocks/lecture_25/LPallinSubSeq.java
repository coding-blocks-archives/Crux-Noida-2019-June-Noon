package com.codingblocks.lecture_25;

public class LPallinSubSeq {
    public static void main(String[] args) {

    }


    public static int longPallinSeq(String line, int start, int end){
        if (start == end){
            return 1;
        }

        if (start > end){
            return 0;
        }

        int res = 0;

        if (line.charAt(start) == line.charAt(end)){
            res = 2 + longPallinSeq(line, start + 1, end - 1);
        } else {
            int left = longPallinSeq(line, start + 1, end);
            int right = longPallinSeq(line, start, end - 1);
            res = Math.max(left, right);
        }

        return res;
    }
}
