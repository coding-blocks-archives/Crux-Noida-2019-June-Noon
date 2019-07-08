package com.codingblocks.lecture_21;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CustomHashSet<K> {

    private ArrayList<LinkedList<Node>> array = new ArrayList<>();

    private int thresh = 3;
    private int size = 0;

    public CustomHashSet(){
        for (int i = 0; i < 31; i++) {
            array.add(new LinkedList<>());
        }
    }

    public void add(K key) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                return;
            }
        }

        list.add(new Node(key));
        size++;

        if (size > thresh * array.size()){
            rehash();
        }

    }

    public void addAll(Collection<K> collection){
        for( K value : collection){
            add(value);
        }
    }

    public void removeAll(Collection<K> collection){
        for( K value : collection){
            remove(value);
        }
    }

    private void rehash() {
        ArrayList<LinkedList<Node>> old = array;

        array = new ArrayList<>();
        for (int i = 0; i < old.size()*2; i++) {
            array.add(new LinkedList<>());
        }
        size = 0;

        for(LinkedList<Node> list : old){
            for(Node node : list){
                add(node.key);
            }
        }

    }


    public boolean remove(K key) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                list.remove(node);
                size--;
                return true;
            }
        }

        return false;
    }

    public boolean contains(K key) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private class Node {
        K key;

        public Node(K key) {
            this.key = key;
        }
    }
}
