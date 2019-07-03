package com.codingblocks.lecture_18;

public class BST {

    private Node root;

    public void add(String item){
        this.root = add(item, root);
    }

    private Node add(String item, Node node) {
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

    private class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }
}
