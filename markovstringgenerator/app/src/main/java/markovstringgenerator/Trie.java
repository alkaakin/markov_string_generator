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

    private TrieNode root;
    private TrieNode current;
    private FileInputStream stream;
    private BufferedReader reader;

    public Trie() {
        this.root = new TrieNode();
    }
    
    public TrieNode returnRoot() {
        return this.root;
    }
    
    public void fileToTrie(File file) throws FileNotFoundException {
        try (Scanner s = new Scanner(file)) {
        //converting the scanner to read a more complext text file
        while (s.hasNext()) {
            String word = s.next().toLowerCase();
            if (word != null || (!word.isEmpty()) || (!word.isBlank())) {
            this.insertTrie(word);
                System.out.println(word);
                }
            }
        }
    }
    
    public void insertTrie(String word) {
        if (this.searchTrie(word)) {
            TrieNode node = returnTerminalNode(word);
            node.frequency++;
            return;
        }
               
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
        current.frequency++;
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
    
    private TrieNode returnTerminalNode(String word) {
        TrieNode current = this.root;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i ++) {
            char letter = word.charAt(i);
            TrieNode nextLetter = current.children.get(letter);
            if (!current.children.containsKey(letter)) {
                return null;
            }
            current = nextLetter;
        }
        return current; 
    }
    
    public void printWords(String prefix){
        
        TrieNode prefixNode = findNodeWithPrefix(prefix); 
        if (prefixNode != null) { 
            List<String> words = new ArrayList<>(); 
            collect(prefixNode, prefix, words); 
            for (String word : words) {
                System.out.println(word);
            }
        }
        
    }
    
    public void printWords(char prefix) {
        
        TrieNode prefixNode = findNodeWithPrefix(prefix); 
        if (prefixNode != null) { 
            List<String> words = new ArrayList<>(); 
            collect(prefixNode, String.valueOf(prefix), words); 
            for (String word : words) {
                System.out.println(word);
            }
        }
        
    }
    
    private TrieNode findNodeWithPrefix(char prefix){
        TrieNode current = this.root;
        if (current != null && current.children.containsKey(prefix)) {
            current = current.children.get(prefix);
            return current;
        }
        else if (current !=null && !current.children.containsKey(prefix)) {
            System.out.println("No words with this prefix in Trie.");
    }
        return null;
    }   
    
    private TrieNode findNodeWithPrefix(String prefix) {
        TrieNode current = this.root;
        for (char ch : prefix.toCharArray()) {
            if (current != null && current.children.containsKey(ch)) {
                current = current.children.get(ch);
            } else {
                System.out.println("No words with this prefix in Trie");
                return null;
            }            
        }  
        return current;
    }
   
    private void collect(TrieNode node, String currentWord, List<String> words) {
        if (node.isTerminal()) {
            words.add(currentWord + node.frequency);
        }
        
        for (char ch : node.children.keySet()) {
            collect(node.children.get(ch), currentWord + ch, words); //tällä rekursiolla saadaan muodostettua sanat!
        }
    }
    
    public boolean doesPrefixExist(String prefix) {
        TrieNode prefixNode = findNodeWithPrefix(prefix);
        return prefixNode != null;
    }
   
    
    private void assertEquals(int length, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
