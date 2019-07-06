package com.codingblocks.lecture_20;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapArrayList<K, V> {

    private ArrayList<Node> array = new ArrayList<>();

    public MapArrayList(){
        for (int i = 0; i < 31; i++) {
            array.add(null);
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node  = array.get(index);
        if ( node != null && node.key.equals(key)){
            node.value = value;
            return;
        }

        if (node == null){
            array.set(index, new Node(key, value));
        }
    }

    public V get(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node  = array.get(index);
        if ( node != null && node.key.equals(key)){
            return node.value;
        }

        return null;
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node  = array.get(index);
        if ( node != null && node.key.equals(key)){
            array.set(index, null);
            return node.value;
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
