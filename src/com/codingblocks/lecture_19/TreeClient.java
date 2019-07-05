package com.codingblocks.lecture_19;

public class TreeClient {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

//        tree.add(1);
//        tree.add(10);
//        tree.add(7);
//
//        tree.display();
//
//        tree.leftRotate();
//
//        tree.display();

        Integer[] nums = new Integer[100];

//
        for (int i = 0; i < 1000000; i++) {
            tree.add(i);
        }


//
//        tree.generateFromSorted(nums);
//
//        System.out.println(tree.successor(80));

        System.out.println(tree.height());
    }
}
