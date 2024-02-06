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
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line != null || !(s.nextLine().isEmpty()) || !(s.nextLine().isBlank())) {
            this.insertTrie(line);
                System.out.println(line);
                }
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
    
    public void printWords(char prefix) {
        //haetaan rootista kirjain a -> tulostetaan jotenkin kaikki sanat, jotka alkaa a:lla
        TrieNode prefixNode = findNodeWithPrefix(prefix); //siirrytään alempaan metodiin eli pyydetään palauttamaan uusi trienode
        if (prefixNode != null) { 
            List<String> words = new ArrayList<>(); //tehdään arraylist
            collect(prefixNode, String.valueOf(prefix), words); //siirrytään taas uuteen metodiin
            for (String word : words) {
                System.out.println(word);
            }
        }
        
    }
    
    //At the moment, the print method works for those words that do have prefixes in the trie.
    
    private TrieNode findNodeWithPrefix(char prefix){
        TrieNode current = this.root;
        if (current != null && current.children.containsKey(prefix)) {
            current = current.children.get(prefix);
            return current;
        }
        else if (current !=null && !current.children.containsKey(prefix)) {
            System.out.println("No words with this prefix in Trie.");;
    }
        return null;
}
    
   
    private void collect(TrieNode node, String currentWord, List<String> words) {
        if (node.isTerminal()) {
            words.add(currentWord);
        }
        
        for (char ch : node.children.keySet()) {
            collect(node.children.get(ch), currentWord + ch, words); //tällä rekursiolla saadaan muodostettua sanat!
        }
    }
    
    private void assertEquals(int length, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
