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


    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
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
