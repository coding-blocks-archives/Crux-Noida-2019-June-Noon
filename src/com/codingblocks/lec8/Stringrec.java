package com.codingblocks.lec8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stringrec {

    public static void main(String[] args) {
        subsequence("","abc");
        subsequenceascii("","abc");

    }

    public static void subsequence(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subsequence(processed+ch,unprocessed);


        subsequence(processed,unprocessed);
    }
    public static void subsequenceascii(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subsequenceascii(processed+ch,unprocessed);

        subsequenceascii(processed+(int)ch,unprocessed);
        subsequenceascii(processed,unprocessed);
    }





}
