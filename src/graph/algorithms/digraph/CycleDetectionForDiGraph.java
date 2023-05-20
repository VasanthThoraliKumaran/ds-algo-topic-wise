package graph.algorithms.digraph;

import graph.Edge;

import java.util.List;

public class CycleDetectionForDiGraph {

    private boolean detectCycleUsingDfs(int node, int[] vis, int[] dfsVis, List<List<Edge>> adjList){
        vis[node] = 1;
        dfsVis[node] = 1;
        for(Edge e: adjList.get(node)){
            if(vis[e.getDestination()] == 0){
                if(detectCycleUsingDfs(e.getDestination(), vis, dfsVis, adjList)){
                    return true;
                }
            }else if(dfsVis[e.getDestination()] == 1){
                return  true;
            }
        }
    return false;
    }

    //O(N + E) : O(N + E) + O(N) + O(N)
    public boolean isCyclic_Dfs(int start, int vertices, List<List<Edge>> adjList) {
        int[] vis = new int[vertices];
        int[] dfsVis = new int[vertices];
        for (int i = start; i <  vertices; i++) {
            if(vis[i] == 0){
                if(detectCycleUsingDfs(i, vis, dfsVis, adjList)){
                    return true;
                }
            }
        }
        return false;
    }
}
