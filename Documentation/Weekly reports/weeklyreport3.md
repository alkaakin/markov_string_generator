## Weekly report pt. 3

# What's been done this week

This week's pretty much been a mess - I haven't been able to start testing, nor have I written any code relating to the Markov chains, nor have I replaced any of the HashMap structures with my own structures. To be fair, I think replacing the HashMap structures will not be that much of work - basically just replacing stuff in the TrieNode class with more elementary structures. 

I've been, however, working on the TrieNode class. I've also been experimenting with Javafx classes already, which isn't still much.

# Advances with the program

I've been honing the Trie and TrieNode classes. I've made some changes to the internal structure of the TrieNode class - mainly that the node methods don't now need information about the manipulated node as an input now, but rather they can be used with parametres. It's now possible to insert words into the tree, as well as search for words. It's also possible to print a TrieNode's children. It's not much, but it's something.

# Lessons learned

That time is of the essence, and also focusing. I've spent something like ten hours on the program this week and haven't been able to do much progress since a lot of the time goes into trying to remember Java better. I've had some advances there, but it doesn't help the program itself.

# What is unclear

Here's the list from last week, perfected with some issues and questions I've faced this week.

1) How are the markov chains implemented algorithmically, and what are they actually about -> This is still unclear and I haven't investigated it at all.
2) Whether I survive Gradle (Dependencies etc. have been causing trouble already) -> I think this won't be an issue in the end.
3) Will my experience with Java be enough to implement this -> I think it most likely will, but there are problems.
4) How the testing works (this is a big issue still - and something I really need to focus on next week) -> This will be the biggest issue next week.
5) The exact functionality of the Trie - how are the nodes traversed? -> Still a bit unclear. The sad thing is that I'm still a bit unsure about the internal structure of traversing the Trie. The biggest issue for me: if I do a depth first search into the trie and find the last character (=node) of a word, how do I get information of the whole word to print it out? Does it happen recursively? Do I need to keep track of the word? I'm also a bit puzzled still as how this all links to Markov chains.

# What will happen next

It's going to be a stressful week - I need to start implement testing and build the markov chains structure next week. This will necessitate that I find out how to traverse the nodes efficiently. It seems a bit hopeless at the moment, but I will keep on trying with the time I have.