package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphDemo {

    public static class Graph {
        private int vertices;
        private List<List<Integer>> adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int src, int dest, boolean bidirectional) {
            adjList.get(src).add(dest);
            if (bidirectional) {
                adjList.get(dest).add(src);
            }
        }

        // BFS Traversal
        public void bfs(int startNode) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[startNode] = true;
            queue.add(startNode);

            System.out.print("BFS (starting from " + startNode + "): ");
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                System.out.print(curr + " ");

                for (int neighbor : adjList.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            System.out.println();
        }

        // DFS Traversal
        public void dfs(int startNode) {
            boolean[] visited = new boolean[vertices];
            System.out.print("DFS (starting from " + startNode + "): ");
            dfsHelper(startNode, visited);
            System.out.println();
        }

        private void dfsHelper(int node, boolean[] visited) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    dfsHelper(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        Graph g = new Graph(5);
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        // Perform Traversals
        g.bfs(0); // Expected: 0 1 4 2 3
        g.dfs(0); // Expected: 0 1 2 3 4
    }
}
