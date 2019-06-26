package com.codingblocks.lec14;

public class StackClient {

    public static void main(String[] args)  {
        DynamicStack stack =new DynamicStack();

        for (int i = 0; i <100 ; i++) {
            stack.push(i);
        }

         try {

             for (int i = 0; i <100 ; i++) {
                 System.out.println(stack.pop());
             }
         }

         catch (Exception e){
             System.out.println(e.getMessage());
         }


    }

}
