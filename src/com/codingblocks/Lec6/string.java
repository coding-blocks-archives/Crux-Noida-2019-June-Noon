package com.codingblocks.Lec6;

public class string {

    public static void main(String[] args) {
        String s= "abc";
//
//        String line="hello";
//        line.concat(s);
//
//
//        System.out.println(s.equals(line));
//
//        System.out.println(s);
//
//        System.out.println(s.indexOf("h"));
//
//        System.out.println(s.substring(1,3));


         pallin(s);

    }


    public static void substring(String s){

        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void pallin(String s){

        int flag=0;

        for (int i = 0; i <s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = 1;
                break;
            }
        }
            if (flag == 0) {
                System.out.println("Pallindrome");
            } else {
                System.out.println("not a pallindrome");
            }
        }
    }

