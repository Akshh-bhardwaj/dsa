package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraDemo {

    public static class Edge {
        int target;
        int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public static class Node implements Comparable<Node> {
        int id;
        int distance;

        public Node(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static int[] dijkstra(List<List<Edge>> adjList, int startNode, int vertices) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startNode] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(startNode, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            int u = curr.id;

            // Skip if we've found a shorter path to u already
            if (curr.distance > dist[u]) continue;

            for (Edge edge : adjList.get(u)) {
                int v = edge.target;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Edge>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add weighted edges
        adjList.get(0).add(new Edge(1, 9));
        adjList.get(0).add(new Edge(2, 6));
        adjList.get(0).add(new Edge(3, 5));
        adjList.get(0).add(new Edge(4, 3));
        
        adjList.get(2).add(new Edge(1, 2)); // 0 -> 2 -> 1 = 6 + 2 = 8 (shorter than direct 0 -> 1 = 9)
        adjList.get(2).add(new Edge(3, 4));

        int startNode = 0;
        int[] distances = dijkstra(adjList, startNode, vertices);

        System.out.println("Shortest path distances from source node " + startNode + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("  To Node " + i + " -> Distance: " + distances[i]);
        }
    }
}
