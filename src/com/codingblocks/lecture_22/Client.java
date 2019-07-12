package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {
        AdjListGraph<Character> graph = new AdjListGraph<>();
//        graph.addVertex("delhi");
//        graph.addVertex("meerut");
//        graph.addVertex("mumbai");
//        graph.addVertex("goa");
//
//        graph.addEdge("goa", "meerut");
//        graph.addEdge("goa", "delhi");
//        graph.addEdge("goa", "mumbai");
//        graph.addEdge("delhi", "meerut");

        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');

        graph.addEdge('a', 'b');
        graph.addEdge('c', 'b');

        graph.addEdge('d', 'e');
        graph.addEdge('f', 'e');

//        graph.display();

        System.out.println(graph.cycle());
    }
}
