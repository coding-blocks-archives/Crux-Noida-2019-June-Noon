package com.codingblocks.Lect12;

public class queueoptimized {

    private int data[];

    private int DEFAULT_SIZE=10;

    private int end=0;
    private int front=0;

    public queueoptimized(){
        data=new int[DEFAULT_SIZE];
    }

    public queueoptimized(int size){
        data= new int[size];
    }


    public boolean isFull()
    {
        return  end==data.length;

    }

    public boolean isEmpty(){
        return end==front;
    }

    public boolean insert(int element){
        if(isFull()){
        return false;
        }
        data[end++]=element;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
          throw new Exception("queue is empty");
        }
        return data[front++];
    }
     public void display(){

         for (int i = front; i <end ; i++) {

             System.out.print(data[i]+", ");

         }
         System.out.println("End");
     }

}
