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


}
