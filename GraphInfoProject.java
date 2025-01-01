import FastGraph.*;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GraphInfoProject {
    public static void main(String[] args) {

        System.out.printf(
                """
                        %sThis is a Graph visualizer and verifier tool.%s
                        This Tool does the following:
                        1. Reads and creates a graph from a file.
                """, "", ""
        );

//        System.out.println(args.length);
//        System.out.println();

        Graph g = new Graph();
        try {
            g.readFile(args[0]);

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.printf("There has been an error with the format of the file. %s", e.getMessage());
//            e.printStackTrace();
            System.exit(23);
        } catch (InvalidObjectType e) {
            System.out.printf("Unknown object call to parameter %s", e.getMessage());
        }


//        for (int i = 1; i < ; i++) {
//
//        }

//        Graph graph = new Graph();
//        graph.GraphInfo();

        //GET FROM COMMAND LINE - the file
    }

}
