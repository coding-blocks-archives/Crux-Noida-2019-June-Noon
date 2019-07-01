package com.codingblocks.lecture_17;

import java.util.*;

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

    public boolean find(int target){
        return find(root, target);
    }

    private boolean find(Node node, int target) {
        boolean found = target == node.value;

        for (int i = 0; i < node.children.size(); i++) {
            found = found || find(node.children.get(i), target);
        }

        return found;
    }

    private int max(Node node) {
        int max = node.value;

        for (int i = 0; i < node.children.size(); i++) {
            max = Math.max(max, max(node.children.get(i)));
        }

        return max;
    }

    private int maxWithChild(Node node) {
        int max = node.value;
        for (int i = 0; i < node.children.size(); i++) {
            max += node.children.get(i).value;
        }

        for (int i = 0; i < node.children.size(); i++) {
            max = Math.max(max, maxWithChild(node.children.get(i)));
        }

        return max;
    }

    public void preOrderItr(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node top = stack.pop();

            System.out.println(top.value);
            for (int i = top.children.size() - 1; i >= 0 ; i--) {
                stack.push(top.children.get(i));
            }
        }
    }

    public void levelOrderItr(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node top = queue.remove();
            System.out.println(top.value);
            for (int i = 0; i < top.children.size() ; i++) {
                queue.add(top.children.get(i));
            }
        }
    }



    public int height(){
        return height(root);
    }

    private int height(Node node) {

        int max = 0;

        for (int i = 0; i < node.children.size(); i++) {
            max = Math.max(max, height(node.children.get(i)));
        }

        return max + 1;
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
