package markovstringgenerator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alkaakin
 */
public class Trie {

    public TrieNode root;
    public TrieNode current;
    private FileInputStream stream;
    private BufferedReader reader;

    public Trie() {
        this.root = new TrieNode();
    }
    
    public TrieNode returnRoot() {
        return this.root;
    }
    
    public void fileToTrie(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        ArrayList words = new ArrayList<String>();
        while (s.hasNextLine()) {
            if (s.nextLine() != null || !(s.nextLine().isEmpty()) || !(s.nextLine().isBlank())) {
            this.insertTrie(s.nextLine());
        }
    }
    }
    
    
    public void insertTrie(String word) {
        if (this.searchTrie(word)) {
            return;
        }
        
        //what needs to be added is a filter for checking if the letter is only a blank space
        TrieNode current = this.root;
        for (int i = 0; i < word.length(); i ++) {
            char letter = Character.toLowerCase(word.charAt(i));
            TrieNode nextLetter = current.children.get(letter);
            if (!current.children.containsKey(letter)) {
                nextLetter = new TrieNode();
                current.children.put(letter, nextLetter);
            }
            current = nextLetter;
        }
        current.terminal = true;
    }
    
    
    public boolean searchTrie(String word) {
        TrieNode current = this.root;
        word = word.toLowerCase();
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
    
    void printWholeTrie() {

    }
    
    
    private void assertEquals(int length, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
