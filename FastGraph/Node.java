package FastGraph;

public class Node {
    /*private*/ String id;
    /*private*/ Integer inDegree;
    /*private*/ Integer outDegree;

    public Node(String id) {
        this.id = id;

//        new Node(id, null, null);
    }
//    public Node(String id, Integer inDegree, Integer outDegree) {
//        this.id = id;
//        this.inDegree = inDegree;
//        this.outDegree = outDegree;
//
//    }
    public String getId() {
        return id;
    }
    public void setInDegree(Integer inDegree) {

    }
    public void setOutDegree(Integer outDegree) {

    }
    public Integer getInDegree() {
        return inDegree;
    }
    public Integer getOutDegree() {
        return outDegree;
    }


}
