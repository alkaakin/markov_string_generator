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
    HashMap<Character, TrieNode> children;
    boolean terminal;

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
        this.terminal = false;
    }
}
