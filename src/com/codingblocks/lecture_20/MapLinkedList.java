package com.codingblocks.lecture_20;

import java.util.LinkedList;

public class MapLinkedList <K, V> {

    private LinkedList<Node> list = new LinkedList<>();

    public void put(K key, V value){
        for (Node node : list){
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));

    }

    public V get(K key){
        for (Node node : list){
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public V remove(K key){
        for (Node node : list){
            if (node.key.equals(key)){
                list.remove(node);
                return node.value;
            }
        }

        return null;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public boolean containsKey(K key){
        for (Node node : list){
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
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
