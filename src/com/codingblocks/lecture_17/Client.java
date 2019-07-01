package com.codingblocks.lecture_17;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        Scanner scanner = new Scanner("10 true 1 false true 11 false false");
        tree.populate(scanner);

        tree.display();
    }
}
