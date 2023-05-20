package graph.algorithms;

import graph.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    //O(N + E) : O(N + E) + O(N) + O(N)
    public List<Integer> bfs(int start, int vertices, List<List<Edge>> adjList) {
        List<Integer> bfs_set = new ArrayList<>();
        boolean[] vis = new boolean[vertices];
        for (int i = start; i < vertices ; i++) {
            if(!vis[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int node = q.poll();
                    bfs_set.add(node);
                    for (Edge e : adjList.get(node)) {
                        if(!vis[e.getDestination()]){
                            vis[e.getDestination()] = true;
                            q.add(e.getDestination());
                        }
                    }
                }

            }
        }
        return bfs_set;
    }
}
