package com.codingblocks.Lect12;

public class queuecircular {

    private int data[];

    private static int DEFAULT_SIZE=10;

    private int end=0;
    private int front=0;
    private int size=0;
    public queuecircular() {
        this(DEFAULT_SIZE);
    }

    public queuecircular(int length) {
        data= new int[length];
    }


    public boolean isFull()
    {
        return  size==data.length;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int element){
        if(isFull()){
        return false;
        }
        data[end++]=element;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
          throw new Exception("queue is empty");
        }
        int temp=data[front++];
        front=front%data.length;
        size--;
        return temp;
    }
//     public void display(){
//
//         for (int i = front; i <end ; i++) {
//
//             System.out.println(data[i]);
//         }
//     }

}
