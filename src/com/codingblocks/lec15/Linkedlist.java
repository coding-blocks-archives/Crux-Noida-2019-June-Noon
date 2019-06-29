package com.codingblocks.lec15;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        size=0;
    }

    public void insertfirst(int element){

        Node node = new Node(element);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int element){
        if(size==0){
            insertfirst(element);
            return;
        }

        Node node=new Node(element);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deletefirst(){

        int temp=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return temp;
    }

    public int deletelast(){

        if(size<2){
            return deletefirst();
        }

        Node node=get(size-2);

//        while(node.next!=tail){
//            node=node.next;
//        }
        int temp=tail.value;
        tail=node;
        tail.next=null;
        size--;
        return temp;
    }

    public Node get(int index){

        Node node=head;

        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }

    public void display(){

        Node node=head;

        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("End");
    }




   private class Node{

       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
