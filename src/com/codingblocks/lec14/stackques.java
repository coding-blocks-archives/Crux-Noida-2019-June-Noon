package com.codingblocks.lec14;

import java.util.Scanner;
import java.util.Stack;

public class stackques {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack =new Stack<>();

        int N=s.nextInt();
        for (int i = 0; i <N ; i++) {
            stack.push(s.nextInt());
        }
        reversestack(stack);
    }

    public static void reversestack(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }

        int temp=stack.pop();
        reversestack(stack);
        System.out.println(temp);
    }
}
