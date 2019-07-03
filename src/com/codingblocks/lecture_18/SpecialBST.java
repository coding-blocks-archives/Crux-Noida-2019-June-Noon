package com.codingblocks.lecture_18;

public class SpecialBST <T extends Comparable<T>> {

    private Node root;

    public void add(T item){
        this.root = add(item, root);
    }

    private Node add(T item, Node node) {
        if (node == null){
            return new Node(item);
        }

        if (item.compareTo(node.value) < 0){
            node.left = add(item, node.left);
        } else if (item.compareTo(node.value) > 0){
            node.right = add(item, node.right);
        }

        return node;
    }

    public void display(){
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    private void displayInRange(Node node, T start, T end) {
        if (node == null){
            return;
        }

        if (node.value.compareTo(start) > 0) {
            displayInRange(node.left, start, end);
        }
        if (node.value.compareTo(start) > 0 && node.value.compareTo(end) < 0) {
            System.out.println(node.value);
        }
        if (node.value.compareTo(end) < 0) {
            displayInRange(node.right, start, end);
        }
    }

    public boolean find(T target){
        return find(target, root);
    }

    private boolean find(T target, Node node) {
        if (node == null){
            return false;
        }

        if (target.compareTo(node.value) == 0){
            return true;
        } else if (target.compareTo(node.value) < 0){
            return find(target, node.left);
        } else {
            return find(target, node.right);
        }


    }

    private class Node {
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
