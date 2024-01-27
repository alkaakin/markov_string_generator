## Weekly report pt. 2

# What's been done this week

I have regretfully not been able to work this week on the project as much as I'd like to - something like five hours or so. The advances haven't been that ambitious, either - I've managed to create some of the basic classes with help from various sources, but the program itself is nowhere near completion - I'm only getting started. I'd be more than happy to be able to contribute a lot more next week, since there are still a lot of functionalities to implement, not to speak of testing, which I haven't really thought of yet.

# Advances with the program

This week I've been able to create a few classes for future use: The Trie class and the TrieNode class being the most robust ones. They still don't work as intended, however, and I still need to figure out how the Trie actually stores information and returns it when asked. 

# Lessons learned

I've been able to figure out the main functionalities of the Trie and how it's supposed to be used. I've also learned that I really need to invest at least twice the amount of the hours I've used in the project so far.

# What is unclear

Here's the list from last week, perfected with some issues and questions I've faced this week.

1) How are the markov chains implemented algorithmically, and what are they actually about
2) Whether I survive Gradle (Dependencies etc. have been causing trouble already)
3) Will my experience with Java be enough to implement this
4) How the testing works (this is a big issue still - and something I really need to focus on next week)
5) The exact functionality of the Trie - how are the nodes traversed? 

# What will happen next

Next week, I will look even closer at the Trie structure. I will try to create the first prototype of the Trie and make it work. The first version will be done using a readymade Java implementation - a HashMap, and this HashMap will be replaced later with another piece of code. I will initially try to make the program work with a simple text file and then upload a larger excel file for the program to scan and store into the Trie. I will also try to start working on the testing part next week. 

# Other things & thoughts in my mind

At the moment of writing this I'm also thinking of the addChild method - I understand that a character is added to a root node (or the previous node anyway), but I'm still not fully sure about why an empty child node is added to the node itself. So let's think about it: what is the information this node contains? 

First, we would create a new Trie by using the Trie class constructor. Using this method creates the root node for the Trie, and we're able to call this by trie.root. Trie.root has all of the functionalities of TrieNode() - including addChild, which adds new children to the root. So if we have a word, let's say ADD, we would first put A into the trie.root by addChild(a, TrieNode childNode). This information would then be included in the HashMap 'children' of the current trienode, which is the root, as explained. As far as I've understood, trie.root would then contain in its children HashMap one key-value pair 'a', 'childNode'. For the D, we would have to first move to A, and then repeat the same (since A is not the final character, the sequence goes on). Once we've mapped 'd', 'childNode' to A's childNode, we would do the same for the final D. After the final character we would set the node.flag to true and end the sequence. This way there are pathways (or edges) known and we can finalize our HashMap.   

