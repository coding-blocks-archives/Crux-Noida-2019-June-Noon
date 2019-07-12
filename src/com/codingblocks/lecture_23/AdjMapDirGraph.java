package com.codingblocks.lecture_23;

import java.util.*;

public class AdjMapDirGraph<T> {

    private Map<T, Vertex> vertexMap = new HashMap<>();

    public  void addVertex(T value){
        if (!vertexMap.containsKey(value)){
            vertexMap.put(value, new Vertex(value));
        }
    }

    public void addEdge(T s, T e, int weight){
        Vertex start = vertexMap.get(s);
        Vertex end = vertexMap.get(e);

        if (start != null && end != null){
            start.addNeighbour(end, weight);
        }
    }

    public LinkedList<T> topological(){
        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        for (Vertex vertex : vertexMap.values()) {
            topological(vertex, visited, stack);
        }

        LinkedList<T> list = new LinkedList<>();

        while (!stack.isEmpty()){
            list.add(stack.pop().value);
        }

        return list;
    }

    private void topological(Vertex vertex, Set<Vertex> visited, Stack<Vertex> stack) {
        if (visited.contains(vertex)){
            return;
        }

        visited.add(vertex);

        for (Vertex padosi: vertex.neighbours.values()) {
            topological(padosi, visited, stack);
        }
        stack.add(vertex);

    }

    private class Vertex {
        T value;
        Map<T, Vertex> neighbours;
        Map<Vertex, Integer> weights;
        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
            weights = new HashMap<>();
        }

        private void addNeighbour(Vertex padosi, int weight){
            neighbours.put(padosi.value, padosi);
            weights.put(padosi, weight);
        }

    }
}
