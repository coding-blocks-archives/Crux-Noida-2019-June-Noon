package com.codingblocks.lecture_21;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {

        Human mohit = new Human("Mohit", 20, 20000);
        Human amit = new Human("Amit", 60, 60000);
        Human raman = new Human("Raman", 20, 10000);

        PriorityQueue<Human> queue = new PriorityQueue<>();

        queue.add(mohit);
        queue.add(amit);
        queue.add(raman);

//        queue.add(2);
//        queue.add(12);
//        queue.add(10);
//        queue.add(4);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        queue.add(1);
//
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

    private static class Human {
        private String name;
        private int age;
        private int salary;

        public Human(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("{ name : %s, age : %d, sal : %d }", name, age, salary);
        }
    }

}
