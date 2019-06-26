package com.codingblocks.lec14;

public class Stack {

    protected int data[];

    private static int DEFAULT_SIZE=10;

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
             throw new Exception("The array is empty");
        }

        return data[top--];
    }

    public int top(){

        return data[top];
    }
}
