/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markovstringgenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testVisualization extends Application {

    private static final double NODE_RADIUS = 20;
    private static final double LINE_LENGTH = 50;

    public testVisualization() {
        
    }
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        Trie trie = createSampleTrie();
        Pane pane = new Pane();
        displayTrie(pane, trie.returnRoot(), 100, 50, 0);
        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Trie Visualizer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayTrie(Pane pane, TrieNode node, double x, double y, int depth) {
        if (node == null) {
            return;
        }

        // Display the current node
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(x, y, NODE_RADIUS);
        pane.getChildren().addAll(circle, new Label(String.valueOf(depth)));

        // Display children and connect them with lines
        int childCount = 0;
        for (TrieNode child : node.children.values()) {
            double angle = Math.toRadians(360.0 / node.children.size() * childCount);
            double childX = x + LINE_LENGTH * Math.cos(angle);
            double childY = y + LINE_LENGTH * Math.sin(angle);

            Line line = new Line(x, y, childX, childY);
            pane.getChildren().add(line);

            displayTrie(pane, child, childX, childY, depth + 1);

            childCount++;
        }
    }

    // Create a sample trie for testing
    private Trie createSampleTrie() throws FileNotFoundException {
        Trie trie = new Trie();
        File file = new File("/home/alkaakin/markov_string_generator/markovstringgenerator/nimilista.txt");  // Replace with the actual file path
        trie.fileToTrie(file);
        return trie;
    }

    
}