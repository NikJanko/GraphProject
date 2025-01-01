package FastGraph;

public class Node {
    /*private*/ String id;
    /*private*/ Integer inDegree;
    /*private*/ Integer outDegree;

    public Node(String id) {
        this.id = id;

//        new Node(id, null, null);
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
    public Integer getInDegree() {
        return inDegree;
    }
    public Integer getOutDegree() {
        return outDegree;
    }


}
