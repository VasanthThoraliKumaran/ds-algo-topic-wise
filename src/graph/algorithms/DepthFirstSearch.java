package graph.algorithms;

import graph.Edge;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    private void dfs(int node, boolean[] vis, List<List<Edge>> adjList, List<Integer> dfs_set){
        dfs_set.add(node);
        vis[node] = true;
        for(Edge edge: adjList.get(node)){
            if(!vis[edge.getDestination()]){
                dfs(edge.getDestination(), vis, adjList, dfs_set);
            }
        }
    }

    //O(N + E) : O(N + E) + O(N) + O(N)
    public List<Integer> dfs(int start, int vertices, List<List<Edge>> adjList) {
        List<Integer> dfs_set = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        for(int i=1;i<vertices;i++){
            if(!visited[i]){
                dfs(i, visited, adjList, dfs_set);
            }
        }
        return dfs_set;
    }
}
