package com.codingblocks.lecture_17;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner("1 true 2 true 5 false true 6 false false true 3 true 7 false false true 4 false false");
//        tree.populate(scanner);
//
//        tree.display();
//
//        System.out.println("-----");
//
//        tree.levelOrderItr();

        int a = scanner.nextInt();
        String line = scanner.nextLine();

        System.out.println(a);
        System.out.println(line);
    }
}
