package graph.algorithms;

import graph.Edge;

import java.util.*;

public class TopologicalSort {

    private void doTopologicalSort(int node, boolean[] vis, List<List<Edge>> adjList, Stack<Integer> res){
        vis[node] = true;
        for(Edge e: adjList.get(node)){
            if(!vis[e.getDestination()]){
                doTopologicalSort(e.getDestination(), vis, adjList, res);
            }
        }
        res.add(node);
    }

    //O(N + E) : O(N + E) + O(N) + O(N)
    public List<Integer> topologicalSortUsingDfs(int start, int vertices, List<List<Edge>> adjList) {
        Stack<Integer> topological_set = new Stack<>();
        boolean[] vis = new boolean[vertices];
        Arrays.fill(vis, false);
        for (int i = start; i <vertices ; i++) {
            if(!vis[i]){
                doTopologicalSort(i, vis, adjList, topological_set);
            }
        }

        List<Integer> topologicalOrderVertices = new ArrayList<>();
        while (!topological_set.isEmpty()){
            int node = topological_set.pop();
            topologicalOrderVertices.add(node);
        }

        return topologicalOrderVertices;
    }

    //O(V * E) : O(V + E) + O(N) + O(N)
    public List<Integer> topologicalSortUsingBfs(int start, int vertices, List<List<Edge>> adjList) {
        int[] inDeg = new int[vertices];
        List<Integer> topologicalSet = new ArrayList<>();
        for (int i = start; i < vertices ; i++) {
            for(Edge e: adjList.get(i)){
                inDeg[e.getDestination()]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int n: inDeg){
            if(n == 0){
                q.add(n);
            }
        }

        while (!q.isEmpty()){
            Integer node = q.poll();
            topologicalSet.add(node);
            for(Edge e: adjList.get(node)){
                inDeg[e.getDestination()]--;
                if(inDeg[e.getDestination()] == 0){
                    q.add(e.getDestination());
                }
            }
        }
        return topologicalSet;
    }
}
