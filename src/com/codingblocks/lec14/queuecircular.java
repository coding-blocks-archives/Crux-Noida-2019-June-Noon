package com.codingblocks.lec14;

public class queuecircular {

    protected int data[];

    private static int DEFAULT_SIZE=10;

    protected int end=0;
    protected int front=0;
    protected int size=0;
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
        System.out.println("adding"+ element);
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
     public void display(){

         for (int i = 0; i <size ; i++) {

             System.out.print(data[(front+i)%data.length]+" ");
         }
         System.out.println();
     }

}
