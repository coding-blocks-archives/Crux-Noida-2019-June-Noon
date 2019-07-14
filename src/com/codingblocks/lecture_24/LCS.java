package com.codingblocks.lecture_24;

import java.util.Map;

public class LCS {
    public static void main(String[] args) {

        String first = "amatyretyuretyutretyutrertyutrn";
        String second = "manayuitreyuitretyutretyureyun";

        System.out.println(lcsItr(first, second));
    }

    public static int lcs(String first, String second, int f_len, int s_len){
        if (f_len == 0 || s_len == 0){
            return 0;
        }

        int ans = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            ans = 1 + lcs(first, second, f_len-1, s_len-1);
        } else {
            int left = lcs(first, second, f_len-1, s_len);
            int right = lcs(first, second, f_len, s_len-1);
            ans = Math.max(left, right);
        }

        return ans;
    }

    public static int lcs(String first, String second, int f_len, int s_len, Integer[][] mem){
        if (f_len == 0 || s_len == 0){
            return 0;
        }

        if (mem[f_len][s_len] != null){
            return mem[f_len][s_len];
        }

        int ans = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            ans = 1 + lcs(first, second, f_len-1, s_len-1, mem);
        } else {
            int left = lcs(first, second, f_len-1, s_len, mem);
            int right = lcs(first, second, f_len, s_len-1, mem);
            ans = Math.max(left, right);
        }

        mem[f_len][s_len] = ans;

        return ans;
    }


    public static int lcsItr(String first, String second){

        Integer[][] mem = new Integer[first.length() + 1][second.length() + 1];

        for (int f = 0; f <= first.length(); f++) {
            for (int s = 0; s <= second.length(); s++) {
                if (f == 0 || s == 0){
                    mem[f][s] = 0;
                } else {
                    int ans = 0;
                    if (first.charAt(f-1) == second.charAt(s-1)){
                        ans = mem[f-1][s-1] + 1;
                    } else {
                        int left = mem[f-1][s];
                        int right = mem[f][s-1];
                        ans = Math.max(left, right);
                    }

                    mem[f][s] = ans;
                }
            }
        }

        return mem[first.length()][second.length()];
    }

}
