package com.codingblocks.lec14;

import java.util.Stack;

public class stackqueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public stackqueue(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void insert(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int temp=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return temp;

    }

    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int temp=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return temp;
    }



}
