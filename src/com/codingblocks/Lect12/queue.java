package com.codingblocks.Lect12;

public class queue {

    private int data[];

    private int DEFAULT_SIZE=10;

    private int end=0;

    public queue(){
        data=new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return  end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
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
        int temp=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return temp;
    }
     public void display(){

         for (int i = 0; i <end ; i++) {

             System.out.println(data[i]);
         }
     }

}
