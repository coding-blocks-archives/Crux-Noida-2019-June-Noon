package com.codingblocks.lecture_23;

import java.util.*;

public class AdjMapGraph <T> {

    private Map<T, Vertex> vertexMap = new HashMap<>();

    public  void addVertex(T value){
        if (!vertexMap.containsKey(value)){
            vertexMap.put(value, new Vertex(value));
        }
    }

    public void addEdge(T s, T e){
        Vertex start = vertexMap.get(s);
        Vertex end = vertexMap.get(e);

        if (start != null && end != null){
            start.neighbours.put(e, end);
            end.neighbours.put(s, start);
        }
    }

    public void DFT(T start){
        Vertex v = vertexMap.get(start);

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        set.add(v);
        stack.add(v);

        while (!stack.isEmpty()){
            Vertex top = stack.pop();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbours.values()) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        while (parents.get(vertex) != null){
            vertex = parents.get(vertex);
        }
        return vertex;
    }

    private boolean union(Vertex first, Vertex second, Map<Vertex, Vertex> parents){
        first = find(first, parents);
        second = find(second, parents);

        if (first != second){
            parents.put(first, second);
            return true;
        } else {
            return false;
        }
    }

    private class Vertex {
        T value;
        Map<T, Vertex> neighbours;
        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }

    }
}
