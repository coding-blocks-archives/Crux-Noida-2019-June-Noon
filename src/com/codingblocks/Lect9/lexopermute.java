package com.codingblocks.Lect9;

import java.util.Arrays;

public class lexopermute {

    public static void main(String[] args) {

        String s="cab";
        int freq[]=frequency(s);
//        lexopermute("",freq,s.length());
        dictlexopermute("",freq,s.length(),s);

    }

    public static void lexopermute(String processed, int[] freq,int length ){

        if(length==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>0){
                freq[i]--;
                lexopermute(processed+(char)(i+'a'),freq,length-1);
                freq[i]++;
            }

        }


    }

    public static void dictlexopermute(String processed, int[] freq,int length,String s){

        if(length==0){
            if(s.compareTo(processed)<0){
                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>0){
                freq[i]--;
                dictlexopermute(processed+(char)(i+'a'),freq,length-1,s);
                freq[i]++;
            }

        }


    }

    public static int[] frequency(String s){
        int ar[]=new int[26];

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            ar[ch-'a']++;
        }
        return ar;
    }
}
