package com.codingblocks.Lect12;

public class StackClient {

    public static void main(String[] args)  {
        Stack stack =new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

         try {

             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
         }

         catch (Exception e){
             System.out.println(e.getMessage());
         }


    }

}
