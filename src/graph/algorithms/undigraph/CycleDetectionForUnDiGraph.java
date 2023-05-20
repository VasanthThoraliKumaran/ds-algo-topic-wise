package graph.algorithms.undigraph;

import graph.Edge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphNode {
    int node;
    int parent;
    GraphNode(int node, int parent){
       this.node = node;
       this.parent = parent;
    }
}

public class CycleDetectionForUnDiGraph {

    boolean detectCycleUsingBfs(int node, List<List<Edge>> adjList, boolean[] vis) {
        Queue<GraphNode> q = new LinkedList<>();
        q.add(new GraphNode(node, -1));
        vis[node] = true;

        while (!q.isEmpty()){
            GraphNode gNode = q.poll();
                for(Edge e: adjList.get(gNode.node)){
                    if(!vis[e.getDestination()]){
                        vis[e.getDestination()] = true;
                        q.add(new GraphNode(e.getDestination(), gNode.node));
                    }else if(e.getDestination() != gNode.parent){
                        return true;
                    }
                }
        }
    return false;
    }

    //O(N + E) : O(N+E) + O(N) + O(N)
    public boolean isCyclic_Bfs(int start, int vertices, List<List<Edge>> adjList) {
        boolean[] vis = new boolean[vertices];
        Arrays.fill(vis, false);
        for (int i = start; i < vertices ; i++) {
            if(!vis[i]){
                if(detectCycleUsingBfs(i, adjList, vis)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean detectCycleUsingDfs(int node,int parent, List<List<Edge>> adjList, boolean[] vis) {
        vis[node] = true;
        for(Edge e: adjList.get(node)){
            if(!vis[e.getDestination()]){
                if(detectCycleUsingDfs(e.getDestination(), node, adjList, vis)){
                    return true;
                }
            }else if(e.getDestination()!= node)return true;
        }
        return false;
    }

    //O(N + E) : O(N+E) + O(N) + O(N)
    public boolean isCyclic_Dfs(int start, int vertices, List<List<Edge>> adjList) {
        boolean[] vis = new boolean[vertices];
        for (int i = start; i < vertices; i++) {
            if(!vis[start]){
                if(detectCycleUsingDfs(i, -1, adjList, vis)){
                    return true;
                }
            }
        }

        return false;
    }
}
