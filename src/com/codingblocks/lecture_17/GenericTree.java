package com.codingblocks.lecture_17;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private Node root;

    public void populate(Scanner sc){
        System.out.print("Enter value for root : ");
        int value = sc.nextInt();
        this.root = new Node(value);
        populate(this.root, sc);
    }

    private void populate(Node node, Scanner sc) {
        while (true){
            System.out.println("Do you want to add child for " + node.value);
            boolean yes = sc.nextBoolean();
            if (yes){
                System.out.print("Enter value for child of " + node.value);
                int value = sc.nextInt();
                Node child = new Node(value);
                node.children.add(child);
                populate(child, sc);
            } else {
                break;
            }
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {

        System.out.println(indent + node.value);

        for (int i = 0; i < node.children.size(); i++) {
            display(node.children.get(i), indent + "\t");
        }

    }

    private class Node {
        int value;
        ArrayList<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
