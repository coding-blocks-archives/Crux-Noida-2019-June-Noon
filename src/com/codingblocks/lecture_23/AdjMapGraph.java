package com.codingblocks.lecture_23;

import java.util.*;

public class AdjMapGraph <T> {

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
            end.addNeighbour(start, weight);
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



    public int kruskal(){
        ArrayList<Edge> edges = new ArrayList<>();
        for (Vertex vertex : vertexMap.values()) {
            for (Vertex padosi : vertex.neighbours.values()) {
                int weight = vertex.weights.get(padosi);
                edges.add(new Edge(vertex, padosi, weight));
            }
        }

        edges.sort((o1, o2) -> o1.weight - o2.weight);
        Map<Vertex, Vertex> parents = parents();

        int weights = 0;

        for (Edge edge : edges) {
            if (union(edge.start, edge.end, parents)){
                weights += edge.weight;
            }
        }

        return weights;
    }

    public AdjMapGraph<T> kruskalGraph(){

        AdjMapGraph<T> graph = new AdjMapGraph<>();

        ArrayList<Edge> edges = new ArrayList<>();
        for (Vertex vertex : vertexMap.values()) {
            graph.addVertex(vertex.value);
            for (Vertex padosi : vertex.neighbours.values()) {
                int weight = vertex.weights.get(padosi);
                edges.add(new Edge(vertex, padosi, weight));
            }
        }

        edges.sort((o1, o2) -> o1.weight - o2.weight);
        Map<Vertex, Vertex> parents = parents();

        for (Edge edge : edges) {
            if (union(edge.start, edge.end, parents)){
                graph.addEdge(edge.start.value, edge.end.value, edge.weight);
            }
        }

        return graph;
    }

    public int prims(){
        PriorityQueue<Edge> queue = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        Set<Vertex> visited = new HashSet<>();

        Vertex v = vertexMap.values().iterator().next();
        for (Vertex padosi : v.neighbours.values()) {
            int weight = v.weights.get(padosi);
            queue.add(new Edge(v, padosi, weight));
        }
        visited.add(v);

        int weights = 0;

        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (visited.contains(edge.end)){
                continue;
            }

            weights += edge.weight;
            Vertex end = edge.end;
            visited.add(end);

            for (Vertex padosi : end.neighbours.values()) {
                if (!visited.contains(padosi)) {
                    int weight = end.weights.get(padosi);
                    queue.add(new Edge(end, padosi, weight));
                }
            }

        }

        return weights;
    }

    private Map<Vertex, Vertex> parents(){
        Map<Vertex, Vertex> parents = new HashMap<>();
        for (Vertex vertex : vertexMap.values()) {
            parents.put(vertex, null);
        }
        return parents;
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

    private class Edge {
        Vertex start;
        Vertex end;
        int weight;

        public Edge(Vertex start, Vertex end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
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
