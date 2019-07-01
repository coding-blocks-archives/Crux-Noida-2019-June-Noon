package com.codingblocks.lecture_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClient {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");

        Scanner scanner = new Scanner(file);

        BinaryTree tree = new BinaryTree();

        tree.add(scanner);
        tree.add(scanner);
        tree.add(scanner);
        tree.add(scanner);
        tree.add(scanner);

        tree.display();

    }
}
