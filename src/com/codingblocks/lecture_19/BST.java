package com.codingblocks.lecture_19;

import java.util.Arrays;

public class BST <T extends Comparable<T> > {

    private Node root;

    public void add(T value){
        this.root = add(root, value);
    }

    private Node add(Node node, T value) {
        if (node == null){
            return new Node(value);
        } else if(value.compareTo(node.value) < 0){
            node.left = add(node.left, value);
        } else if(value.compareTo(node.value) > 0){
            node.right = add(node.right, value);
        }

        node = balance(node);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void generateFromPreIn(T[] pre, T[] in){
        this.root = generateFromPreInRec(pre, in);
    }

    private Node generateFromPreInRec(T[] pre, T[] in) {
        if(pre.length == 0){
            return null;
        }

        T value = pre[0];
        int index = find(in, value);

        T[] in_left = Arrays.copyOfRange(in, 0, index);
        T[] in_right = Arrays.copyOfRange(in, index+1, in.length);

        T[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        T[] pre_right = Arrays.copyOfRange(pre, index+1, in.length);

        Node node = new Node(value);
        node.left = generateFromPreInRec(pre_left, in_left);
        node.right = generateFromPreInRec(pre_right, in_right);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int find(T[] nums, T target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].compareTo(target) == 0){
                return i;
            }
        }
        return -1;
    }

    private Node balance(Node node) {
        if (height(node.left) - height(node.right) > 1){
            if (height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
            }
            node = rightRotate(node);
        }

        if (height(node.left) - height(node.right) < -1){
            if (height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
            }
            node = leftRotate( node);
        }

        return node;
    }

    public void generateFromSorted(T[] arr){
        this.root = generateFromSorted(arr, 0, arr.length -1);
    }

    private Node generateFromSorted(T[] arr, int start, int end) {
        if (start > end){
            return null;
        }

        int mid = (start + end)/2;
        Node node = new Node(arr[mid]);
        node.left = generateFromSorted(arr, start, mid-1);
        node.right = generateFromSorted(arr, mid+1, end);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if (node == null){
            return 0;
        }

        return node.height;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null){
            return true;
        }

        boolean current = Math.abs(height(node.left) - height(node.right)) < 2;

        return current && isBalanced(node.left) && isBalanced(node.right);
    }

    public void leftRotate(){
        this.root = leftRotate(root);
    }

    public void rightRotate(){
        this.root = rightRotate(root);
    }

    private Node rightRotate(Node x){
        Node y = x.left;
        Node t2 = y.right;

        y.right = x;
        x.left = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    private Node leftRotate(Node y){
        Node x = y.right;
        Node t2 = x.left;

        x.left = y;
        y.right = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;

    }

    public T successor(T value){
        T next = null;
        Node current = root;

        while (current != null){
            if (current.value.compareTo(value) > 0){
                if (next == null || current.value.compareTo(next) < 0) {
                    next = current.value;
                }
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return next;
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

    private class Node {
        T value;
        Node left;
        Node right;
        int height;

        public Node(T value) {
            this.value = value;
            this.height = 1;
        }
    }
}
