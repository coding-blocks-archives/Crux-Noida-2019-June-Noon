package com.codingblocks.lecture_17;

import java.util.Scanner;

public class BinaryTree {

    private Node root;


    public void add(Scanner sc){
        this.root = add(this.root, sc);
    }

    private Node add(Node node, Scanner sc) {
        if (node == null){
            int value = Integer.parseInt(sc.nextLine());
            return new Node(value);
        }

        String dir = sc.nextLine();

        if (dir.equals("l")){
            node.left = add(node.left, sc);
        } else {
            node.right = add(node.right, sc);
        }

        return node;
    }

    public void display(){
        display(root, "", "root");
    }

    public boolean find(int target){
        return find(root, target);
    }

    private boolean find(Node node, int target) {
        if (node == null){
            return false;
        }

        return node.value == target || find(node.left, target) || find(node.right, target);
    }


    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    private int max(Node node){
        if (node == null){
            return Integer.MIN_VALUE;
        }

        int max = Math.max(max(node.left), max(node.right));

        return Math.max(max, node.value);

    }

    private class Node{
        Integer value;
        Node left;
        Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }
}
