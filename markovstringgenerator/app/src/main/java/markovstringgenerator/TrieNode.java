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
    //HashMap children stores information on the character in question and any other trienodes it references
    //HashMap frequencies is only active for the last node of a word (the last letter). It is used to store information about the following words.
    HashMap<Character, TrieNode> children;
    HashMap<String, Integer> frequencies;
    boolean terminal;

    public TrieNode() {
        
        this.children = new HashMap<Character, TrieNode>();
        this.terminal = false;
        this.frequencies = new HashMap<String, Integer>();
    }
    
    public Collection<TrieNode> getChild() {
        return children.values();
    }
    
    public boolean hasChildren() {
        if (children.values().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public void getAllChildren() {
        
        for (TrieNode child : this.children.values()) {
            System.out.println(child.toString());
            if (child.hasChildren()) {
                child.getAllChildren();
            }
        }
          
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
    
    public String highestValueKey() {
        
        HashMap<String, Integer> map = this.frequencies;
        int max = Integer.MIN_VALUE;
        String maxKey = null;
        ArrayList<String> maxKeys = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            if (value > max) {
                maxKeys.clear();
                maxKeys.add(key);
                max = value;
            } else if (value == max) {
                maxKeys.add(key);
            }
            
        }
        if (!maxKeys.isEmpty()) {
            Random random = new Random();
            int i = random.nextInt(maxKeys.size());
            return maxKeys.get(i);
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "TrieNode{" +
                "children=" + children.keySet() +
                "frequencies=" + frequencies.keySet() +
                ", terminal=" + terminal +
                '}';
    }
    
    public String returnFrequencies(String word) {
        StringBuilder result = new StringBuilder();
        
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            result.append("First word: ").append(word).append(" Second word: ").append(key).append(", Times followed by: ").append(value).append("\n"); 
        }
        
        return result.toString();
    }
    
    
}