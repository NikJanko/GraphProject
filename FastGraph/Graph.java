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

        } else if (file instanceof String[][]){
            System.out.println("functionality not implemented yet");
            System.exit(0);
            //if we get a graph already
        } else {
            throw new InvalidObjectType();
        }
        
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

    public void setIndegree(){
        for (int i = 0; i < labels.length; i++) {
            
        }
        
    }
    
}