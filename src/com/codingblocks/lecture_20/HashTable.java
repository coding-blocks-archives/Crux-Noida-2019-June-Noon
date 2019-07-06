package com.codingblocks.lecture_20;


import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <K, V> {

    private ArrayList<LinkedList<Node>> array = new ArrayList<>();

    private int thresh = 3;
    private int size = 0;

    public HashTable(){
        for (int i = 0; i < 31; i++) {
            array.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
        size++;

        if (size > thresh * array.size()){
            rehash();
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
                put(node.key, node.value);
            }
        }

    }


    public V get(K key) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public V remove(K key) {
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                list.remove(node);
                size--;
                return node.value;
            }
        }

        return null;
    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
