package FastGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph implements IGraph {
    private Node[] labels;
    private int[][] connections;

    @Override
    public void NetworkInfo() {

    }

    @Override
    public void GraphInfo() {

    }

    @Override
    public void NodeInfo(Node n) {

    }
    //todo here. finish the connections and node creations for labels then get inDegrees, outDegrees and such.
    @Override
    public void readFile(Object file) throws FileNotFoundException, NumberFormatException, InvalidObjectType{
        if (file instanceof String filename) {
            File graphFile = new File(filename); //open file from command line
            Scanner reader = new Scanner(graphFile);


            String[] labelHeaders = reader.nextLine().split(" ");
            this.labels = new Node[labelHeaders.length];

            for (int pos = 0; pos < labelHeaders.length; pos++) {
                this.labels[pos] = new Node(labelHeaders[pos]);
            }

            this.connections = new int[this.labels.length][this.labels.length];
            for (int i = 0; i < this.labels.length; i++) {
                for (int j = 0; j < this.labels.length; j++) {
                    //MAY throw invalid Integer when parsing "s90" for example.
                    this.connections[i][j] = Integer.parseInt(reader.next());
                }
            }

            gridGraphOutput();


        } else if (file instanceof String[][]){
            System.out.println("functionality not implemented yet");
            System.exit(0);
            //if we get a graph already
        } else {
            throw new InvalidObjectType();
        }


////            String graphName = reader.nextLine();
//        Labels = reader.nextLine().split(" ");
//        int j = 0;
//        while (reader.hasNextLine()) {
//            String line = reader.nextLine();
//            String[] tokens = line.split(" ");
//            for (int i = 0; i < tokens.length; i++) {
//                arr[j][i] = Integer.parseInt(tokens[i]);
//            }
//            j++;
//        }
//
//
//        for (String label : Labels) {
//            System.out.printf("%s%s%s ", "\033[95m", label, "\033[0m");
//        }
//        System.out.println();
//
//        for (int[] row : arr) {
//            for (int col : row) {
//                System.out.printf("%s%d %s", (col == 0 ? "\033[91m" : ""), col, (col == 0 ? "\033[0m" : ""));
//
////                System.out.printf("%d ", col);
//            }
//            System.out.println();
//        }
    }

    @Override
    public void gridGraphOutput(){
        for (Node nodeName : this.labels) {
            System.out.printf("%s%s%s ","\033[93m", nodeName.getId(), "\033[0m");
        }
        System.out.println();

        for (int[] row : this.connections) {
            for (int elem : row) {
                System.out.printf("%s%d %s",(elem == 0? "\033[91m":""), elem, "\033[0m");
            }
            System.out.println();
        }
    }

//    public String[] get_node_data(Node n){
//
//
//        String[] node_data = new String[3];
//        node_data[0] = n.id;
//        node_data[1] = String.valueOf(n.inDegree);
//        node_data[2] = String.valueOf(n.outDegree);
//
//        return node_data;
//    }
}