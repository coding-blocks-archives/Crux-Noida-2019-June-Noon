package com.codingblocks.lec15;

import java.util.Stack;

public class queueusingstack {

    Stack<Integer> first;
    Stack<Integer> second;

    public queueusingstack(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void insert(int element){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(element);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }


    public int remove() throws Exception{

     return first.pop();
    }

    public int peek() throws Exception{
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}
