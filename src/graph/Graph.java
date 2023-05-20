package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private final int vertices;
    private final List<List<Edge>> adjList;

    public Graph(int vertices){
        this.vertices = vertices;
        this.adjList = new LinkedList<>();
        this.initialize();
    }

    private void initialize() {
        for(int i=0;i<vertices;i++){
            adjList.add(i, new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        adjList.get(source).add(edge);
    }
    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjList.get(source).add(edge);
    }

    public int getVertices() {
        return vertices;
    }

    public List<List<Edge>> getAdjList() {
        return adjList;
    }
}
