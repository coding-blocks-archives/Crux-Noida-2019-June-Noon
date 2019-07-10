package com.codingblocks.lecture_23;

import java.util.LinkedList;

public class EdgeListGraph <T> {

    private LinkedList<Vertex> vertices = new LinkedList<>();
    private LinkedList<Edge> edges = new LinkedList<>();

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T s, T e){
        Vertex start = find(s);
        Vertex end = find(e);

        if (start != null && end != null){
            edges.add(new Edge(start, end));
            edges.add(new Edge(end, start));
        }
    }


    private Vertex find(T value){
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    private class Vertex {
        T value;
        public Vertex(T value) {
            this.value = value;
        }
    }

    private class Edge {
        Vertex start;
        Vertex end;
        public Edge(Vertex start, Vertex end) {
            this.start = start;
            this.end = end;
        }
    }
}
