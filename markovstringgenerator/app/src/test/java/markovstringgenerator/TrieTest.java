/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package markovstringgenerator;

import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alkaakin
 */
public class TrieTest {
    
    public TrieTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of returnRoot method, of class Trie.
     */
    @Test
    public void testReturnRoot() {
        System.out.println("returnRoot");
        Trie instance = new Trie();
        TrieNode expResult = null;
        TrieNode result = instance.returnRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileToTrie method, of class Trie.
     */
    @Test
    public void testFileToTrie() throws Exception {
        System.out.println("fileToTrie");
        File file = null;
        Trie instance = new Trie();
        instance.fileToTrie(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTrie method, of class Trie.
     */
    @Test
    public void testInsertTrie() {
        System.out.println("insertTrie");
        String word = "";
        Trie instance = new Trie();
        instance.insertTrie(word);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTrie method, of class Trie.
     */
    @Test
    public void testSearchTrie() {
        System.out.println("searchTrie");
        String word = "";
        Trie instance = new Trie();
        boolean expResult = false;
        boolean result = instance.searchTrie(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printWholeTrie method, of class Trie.
     */
    @Test
    public void testPrintWholeTrie() {
        System.out.println("printWholeTrie");
        Trie instance = new Trie();
        instance.printWholeTrie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
