package graph;

import graph.algorithms.BreadthFirstSearch;
import graph.algorithms.DepthFirstSearch;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);
        graph.addEdge(2, 7);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(4, 6);
        graph.addEdge(5, 3);
        graph.addEdge(6, 4);
        graph.addEdge(6, 7);
        graph.addEdge(7, 2);
        graph.addEdge(7, 6);

        DepthFirstSearch dfsTraversal = new DepthFirstSearch();
        List<Integer> dfs = dfsTraversal.dfs(1, graph.getVertices(), graph.getAdjList());
        for(int n: dfs){
            System.out.print(n+" ");
        }
        System.out.println();
        BreadthFirstSearch bfsTraversal = new BreadthFirstSearch();
        List<Integer> bfs = bfsTraversal.bfs(1, graph.getVertices(), graph.getAdjList());
        for(int n: bfs){
            System.out.print(n+" ");
        }
    }
}
