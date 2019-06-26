package com.codingblocks.lec14;

public class ArrayList {

    private int data[];
    protected int DEFAULT_SIZE=10;
    private int size=0;

    public ArrayList(){
        data=new int[DEFAULT_SIZE];
    }

    public void add(int item){
        if(isfull()){
            resize();
        }
        System.out.println("Adding item " + item);
        data[size++]=item;

    }

    private void resize() {
        System.out.println("here size is getting doubled");
        int temp[]=new int[data.length*2];

        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
       return size==data.length;
    }

    public int remove(){

    return data[--size];

    }

    public int get(int index){
       return data[index];
    }

    public void set(int index,int item){
           data[index]=item;
    }

    public int size(int item){
        return size;
    }

}
