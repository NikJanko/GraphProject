package FastGraph;

import java.io.FileNotFoundException;

public interface IGraph {
    /**
     * Printing Network information.
     * Connected Nodes (as a link list representation).
     * Each node's inDegrees and outDegrees as well as names.
     * <p>
     * if Euler's path is possible.
     * if Euler's circuit is present.
     * If a topo_sort is possible.
     * And Dynamic Programming solution to the shortest path problem.
     */
    void NetworkInfo();


    String EulerPath();

    String EulerCircuitPath();

    String TopologicalSortPath();

    String[] DynaProgShortestPath();

    /**
     * The Matrix Representation of the Graph
     */
    void GridGraphOutput();


    /**
     * Specific info about a node.
     * <p>
     *     The name of the node.
     *     The inDegrees.
     *     The outDegrees.
     *     It's connections (from not to):
     * </p>
     * @param n The node to do the calculations on.
     */
    void NodeInfo(Node n);


    /**
     * This class creates both our LABELS array, and our EDGE array.
     */
    void readFile(Object file) throws FileNotFoundException, NumberFormatException, InvalidObjectType;

    void getSetDegrees();
}

