package markovstringgenerator;
import java.util.HashMap;

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
    private HashMap<Character, TrieNode> children;
    private boolean flag;
    //A new node is created every time there are new characters to be added to the string
    //The TrieNode class gets no separate input at this point
    public TrieNode() {
        this.children = new HashMap<>();
        this.flag = false;
    }
    //
    //hasChild method checks whether the node in question already contains the character as one of its children
    public boolean hasChild(char x) {
        return children.containsKey(x);
    }
    //The childNode needs to be instantiated in the Trie object
    public void addChild(char x, TrieNode childNode) {
        children.put(x, childNode);
    }
    //This boolean getter comes from the Trie to check for final char
    public boolean finalCharacter(){
        return flag;
    }
    //This is a setter to set character as the final character (end of word)
    public void setAsFinalCharacter(boolean bool) {
        flag = bool;
    }
    
    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }
    
    
    
    
}
