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

    private TrieNode root;
    private TrieNode current;

    public Trie(){
        this.root = new TrieNode();
    }
    
    public void insertTrie(String word) {
        if (this.searchTrie(word)) {
            return;
        }
        //The idea is to always check that the current node is instantiated at the beginning of a method.
        TrieNode current = this.root;
        //The following method is identical to search method, except for the method needs to only check for each children at a time. Should the node in question not have the expected child, the iteration can stop and the rest of the word can be automatically filled in.
        for (int i = 0; i < word.length(); i ++) {
            char letter = word.charAt(i);
    //The rest is work in progress
    }
    }
    
    
    public boolean searchTrie(String word) {
        TrieNode current = this.root;
        for (int i = 0; i < word.length(); i ++) {
            char letter = word.charAt(i);
            TrieNode nextLetter = current.children.get(letter);
            if (!current.children.containsKey(letter)) {
                return false;
            }
            current = nextLetter;
        }
        return current.terminal;
    }
    
    public ArrayList<String> printTrie() {
        //a method for testing if the Trie holds all expected words
        //The method needs to be able to parse together different characters to form words..
        ArrayList<String> trieContents = new ArrayList<>();
        return trieContents;
    }
    
    
    private void assertEquals(int length, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
