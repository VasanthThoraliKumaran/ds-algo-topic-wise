package graph;

public class Edge {
    private final int source;
    private final int destination;
    private int weight;
    Edge(int source, int destination){
        this.source = source;
        this.destination = destination;
    }
    Edge(int source, int destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }


    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
