package markovstringgenerator;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alkaakin
 */
//For now, the TrieNode will be implemented by using a Java HashMap. This will be replaced later with a separate structure
public class TrieNode {
    //HashMap stores information on the character in question and any other trienodes it references
    //
    HashMap<Character, TrieNode> children;
    boolean terminal;

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
        this.terminal = false;
    }
    
    public TrieNode getChild(String x) {
        char character = x.charAt(0);
        return children.get(character);
    }
    
    //Trying to build a recursive method for printing all children of a certain node and then printing all children of the children etc.
    public TrieNode getAllChildren(String x) {
        char character = x.charAt(0);
        while (children.keySet()!= null) {
            System.out.print(children.keySet());
        }
        return null;
    } 
    
    public void setChild(char character, TrieNode childNode) {
        children.put(character, childNode);
    }
    
    public boolean isTerminal() {
        return terminal;
    }
    
    public Set getCharacters() {
        
        Set<Character> keySet = children.keySet();
        return keySet;
    }
    
    @Override
    public String toString() {
        return "TrieNode{" +
                "children=" + children.keySet() +
                ", terminal=" + terminal +
                '}';
    }
    
}
