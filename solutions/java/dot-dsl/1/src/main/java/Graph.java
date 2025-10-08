import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<String, Node> nodes;
    private final List<Edge> edges;
    private final Map<String, String> attributes;

    public Graph() {
        this(Collections.emptyMap());
    }

    public Graph(Map<String, String> attributes) {
        this.nodes = new HashMap<>();
        this.edges = new ArrayList<>();
        this.attributes = new HashMap<>(attributes);
    }

    public Collection<Node> getNodes() {
        return this.nodes.values();
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        return node(name, Collections.emptyMap());
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node node = new Node(name, attributes);

        this.nodes.put(name, node);

        return this;
    }

    public Graph edge(String start, String end) {
        return edge(start, end, Collections.emptyMap());
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge edge = new Edge(start, end,attributes);

        this.edges.add(edge);

        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
