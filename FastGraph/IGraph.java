package FastGraph;

import java.io.FileNotFoundException;

public interface IGraph {
    /**
     * Printing Network information.
     * Connected Nodes (as a link list representation).
     * Each node's inDegrees and outDegrees as well as names.
     * <p>
     * if Breadth first is possible.
     * if Depth first is possible.
     * If a topo_sort is possible
     * And Dynamic Programming solution to the shortest path problem.
     */
    void NetworkInfo();

    /**
     * The array representation of the Graph
     */
    void GraphInfo();

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

    void gridGraphOutput();
}
