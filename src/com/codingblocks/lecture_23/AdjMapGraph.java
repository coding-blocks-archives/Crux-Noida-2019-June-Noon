package com.codingblocks.lecture_23;

import java.util.Map;

public class AdjMapGraph <T> {


    private class Vertex {
        T value;
        Map<T, Vertex> neighbours;
        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }

    }
}
