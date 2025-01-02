package FastGraph;

public class Node {
    private final String id;
    private Integer inDegree;
    private Integer outDegree;

    public Node(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setInDegree(Integer inDegree) {
        this.inDegree = inDegree;
    }
    public void setOutDegree(Integer outDegree) {
        this.outDegree = outDegree;
    }


    private String s_getInDegree() {
        return this.inDegree.toString();
    }
    private String s_getOutDegree() {
        return this.outDegree.toString();
    }

    @Override
    public String toString() {
        return String.format("Node Name= %s, InDegrees= %d, OutDegrees= %d", this.id, this.outDegree, this.inDegree);
    }
}
