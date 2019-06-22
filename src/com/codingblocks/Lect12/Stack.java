package com.codingblocks.Lect12;

public class Stack {

    private int data[];

    private int DEFAULT_SIZE=10;

    private int top=-1;

    public Stack(){

        data=new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return top==data.length-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        data[++top]=item;

        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
             throw new myException("The array is empty");
        }

        return data[top--];
    }

    public int top(){

        return data[top];
    }
}
