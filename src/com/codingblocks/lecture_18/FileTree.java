package com.codingblocks.lecture_18;

import java.io.File;

public class FileTree {
    public static void main(String[] args) {
        File file = new File(".");

        display(file, "");
    }

    public static void display(File file, String indent){
        System.out.println(indent + file.getName());

        if (file.isDirectory()){
            File[] children = file.listFiles();
            for (int i = 0; i < children.length; i++) {
                display(children[i], indent+"\t");
            }
        }
    }
}
