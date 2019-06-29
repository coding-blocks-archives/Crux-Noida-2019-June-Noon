package com.codingblocks.lec15;

public class Main {

    public static void main(String[] args) {

        Teacher teacher =new Javateacher();
        teacher.study();
        teacher.teach();
        ((Javateacher) teacher).dance();
    }
}
