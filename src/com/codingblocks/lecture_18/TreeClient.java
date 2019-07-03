package com.codingblocks.lecture_18;

public class TreeClient {
    public static void main(String[] args) {
        SpecialBST<String> tree = new SpecialBST<>();
        tree.add("mohit");
        tree.add("ram");
        tree.add("om");
        tree.add("punit");

        tree.display();

    }
}
