package markovstringgenerator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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
    
    public void moveIntoNode() {
        
    }
    
    //This insertion to be replaced later with a file scan from the .txt file
    public void insertChild(String name) {
        
        TrieNode current = this.root;
        
        char[] splitname = name.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : splitname) {
            charList.add(c);
        }
        assertEquals(name.length(), charList.size());
        for (int i = 0; i < charList.size(); i ++) {
            //Needing a method for checking if the char being handled is the final char of the string. Then we would need to break the loop and set the flag as true for the hashmap.
            //Check this if statement below, not sure about the charlist index variable.
            if (i == charList.get(i)) {
                current.setAsFinalCharacter(true);
            }
            
            if (!current.hasChild(charList.get(i))) {
                //TrieNode child = New TrieNode(charList.get(i), new TrieNode());
                current.addChild(charList.get(i), new TrieNode());
                //How to move into this?
                current = 
                
            }
            if (current.getChildren().containsKey(x)) {
                
            }
        }
    }
    
    
    public static void main(String[] args) {
        

    }

    private void assertEquals(int length, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
