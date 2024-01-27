package markovstringgenerator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alkaakin
 */
public class Trie {
    //The 'current' node will be used for checking the position in the trie.
    private TrieNode root;
    private TrieNode current;
    //Constructor
    //We should get each character of alphabet into the Trie. For this, we need the TrieNode class. 
    //The root node should probably have 
    public Trie(){
        this.root = new TrieNode();
    }
    
    //This insertion to be replaced later with a file scan from the .txt file
    public void insertChild(String name) {
        TrieNode current = this.root;
        char[] splitname = name.toCharArray();
        /*Let's create a loop that goes through the characters from the beginning of the word; 
        *If the first character is not a child of the node, add the character as the child of the;
        *current node; if it is a child of the current node, break out of the loop and move the pointer (current node);
        *to the next character;
        */
        for (char x : splitname) {
            if (!current.getChildren().containsKey(x)) {
                current.addChild(x, new TrieNode());
            }
        }
    }
    
    
    public static void main(String[] args) {
        

    }
    
    
}
