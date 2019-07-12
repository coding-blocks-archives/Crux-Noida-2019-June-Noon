package com.codingblocks.lecture_22;

import java.util.*;

public class AdjListGraph <T> {

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
            start.neighbours.add(end);
            end.neighbours.add(start);
        }
    }

    public void display(){
        for(Vertex vertex : vertexMap.values()){
            System.out.print(vertex.value + " - > ");
            for (Vertex padosi : vertex.neighbours) {
                System.out.print(padosi.value + " ");
            }
            System.out.println();
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
            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }
    }

    public LinkedList<LinkedList<T>> connectedComponents(){

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        LinkedList<LinkedList<T>> components = new LinkedList<>();

        for (Vertex v : vertexMap.values()) {
            if (set.contains(v)){
                continue;
            }
            LinkedList<T> component = new LinkedList<>();

            set.add(v);
            stack.add(v);

            while (!stack.isEmpty()){
                Vertex top = stack.pop();
                component.add(top.value);
                for (Vertex padosi : top.neighbours) {
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.add(padosi);
                    }
                }
            }

            components.add(component);
        }

        return components;
    }

    public boolean bipart(){

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        for (Vertex v : vertexMap.values()) {
            if (set.contains(v)){
                continue;
            }

            Map<Vertex, Integer> map = new HashMap<>();
            set.add(v);
            stack.add(v);
            map.put(v, 1);

            while (!stack.isEmpty()){
                Vertex top = stack.pop();
                for (Vertex padosi : top.neighbours) {
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.add(padosi);
                        map.put(padosi, map.get(top) ^ 1);
                    } else if (map.get(top) == map.get(padosi)){
                        return false;
                    }
                }
            }

        }

        return true;
    }

    public boolean cycle(){

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        for (Vertex v : vertexMap.values()) {
            if (set.contains(v)){
                continue;
            }

            int count_edge = 0;
            int count_vertex = 0;
            set.add(v);
            stack.add(v);

            while (!stack.isEmpty()){
                Vertex top = stack.pop();
                count_vertex++;
                for (Vertex padosi : top.neighbours) {
                    count_edge++;
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.add(padosi);
                    }
                }
            }

            if (count_edge != (count_vertex-1)*2){
                return true;
            }

        }

        return false;
    }

    public boolean isTreeSec(){

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        int cc = 0;

        for (Vertex v : vertexMap.values()) {
            if (set.contains(v)){
                continue;
            }

            int count_edge = 0;
            int count_vertex = 0;
            set.add(v);
            stack.add(v);

            cc++;

            while (!stack.isEmpty()){
                Vertex top = stack.pop();
                count_vertex++;
                for (Vertex padosi : top.neighbours) {
                    count_edge++;
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.add(padosi);
                    }
                }
            }

            if (count_edge != (count_vertex-1)*2){
                return false;
            }

            if (cc > 1){
                return false;
            }

        }

        return true;
    }

    public boolean isTree(){
        return isConnected() && ! cycle();
    }

    public boolean isConnected(){
        return connectedComponents().size() <= 1;
    }

    public boolean DFS(T start, T target){
        Vertex v = vertexMap.get(start);

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        set.add(v);
        stack.add(v);

        while (!stack.isEmpty()){
            Vertex top = stack.pop();

            if (target.equals(top.value)){
                return true;
            }

            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }

        return false;
    }

    public void BFT(T start){
        Vertex v = vertexMap.get(start);

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        set.add(v);
        queue.add(v);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    private class Vertex {
        T value;
        LinkedList<Vertex> neighbours;
        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }

    }

}
