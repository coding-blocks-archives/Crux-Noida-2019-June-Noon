package com.codingblocks.lecture_25;

public class Edit {
    public static void main(String[] args) {

        String first = "karan";
        String second = "kabir";
        System.out.println(editItr(first, second));
    }

    public static int editItr(String first, String second){
        Integer[][] mem = new Integer[first.length() + 1][second.length() + 1];

        for (int f = 0; f <= first.length() ; f++) {
            for (int s = 0; s <= second.length() ; s++) {
                if (Math.min(f, s) == 0){
                    mem[f][s] = Math.max(f, s);
                } else {
                    if (first.charAt(f-1) == second.charAt(s-1)){
                        mem[f][s] = mem[f-1][s-1];
                    } else {
                        int rm_f = mem[f-1][s];
                        int rm_s = mem[f][s-1];
                        int rm_b = mem[f-1][s-1];
                        mem[f][s] = 1 + Math.min(rm_b, Math.min(rm_f, rm_s));
                    }
                }
            }
        }

        return mem[first.length()][second.length()];
    }


    public static int edit(String first, String second, int f_len, int s_len){
        if (Math.min(f_len, s_len) == 0){
            return Math.max(f_len, s_len);
        }



        int res = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            res = edit(first, second, f_len-1, s_len-1);
        } else {
            int rm_f = edit(first, second, f_len-1, s_len);
            int rm_s = edit(first, second, f_len, s_len-1);
            int rm_b = edit(first, second, f_len-1, s_len-1);

            res = 1 + Math.min(rm_b, Math.min(rm_f, rm_s));
        }



        return res;
    }
}
