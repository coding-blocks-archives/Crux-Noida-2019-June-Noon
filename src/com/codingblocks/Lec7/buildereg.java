package com.codingblocks.Lec7;

public class buildereg {


    public static void main(String[] args) {
        String s="Hello World";

        System.out.println(toggle(s));

//        System.out.println('c'-'a');
//
//        StringBuilder builder= new StringBuilder(s);
//
//          builder.append("World");
//        System.out.println(builder);
//        builder.setCharAt(0,'h');
//
//        System.out.println(builder);

    }

    public static StringBuilder toggle(String s){
          StringBuilder builder=new StringBuilder(s);

        for (int i = 0; i <builder.length() ; i++) {
                 char ch=builder.charAt(i);

                 if(ch>='A' &&  ch<='Z'){
                     ch= (char)('a'+(ch-'A'));
                 }

            else if(ch>='a' &&  ch<='z'){
                ch= (char)('A'+(ch-'a'));
            }
                      builder.setCharAt(i,ch);


        }
             return builder;
    }

}
