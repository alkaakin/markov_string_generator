## Weekly report pt. 4

# What's been done this week

I took a couple of steps back this week. I was getting lost with the structure of the program and what I need to do to actually meet the goals I want to achieve with it, so I contacted the course supervisor to ask about it. I got some nice advice: I'd need to think what I actually want to get done with the program. So far I'd only been focusing on getting the Trie to work. My main goal should be understanding how the autocomplete works and how I can implement that; the Trie is only a backdrop for all that. 

Nevertheless I feel like time's ticking a bit too fast for me and that the course seems to be a bit too tight scheduled for my skills at the moment. I'm content with that I've been able to make so far and will try to hone my program into the right direction even if I miss the official course deadline. I will hopefully then be able to use this program skeleton in the next period, if the course takes place then. 

# Advances with the program

As said, I took a step back. The Trie class is now mostly complete, at least for my current needs. It's able to do inserting of words and searching of words, as well as printing words if inputted by either a character or a string prefix. So I'm able to manipulate the Trie itself in a satisfactory way, sorts of. A big discovery for me was to add the frequency variable to the TrieNode class, so now I at least have taken the first steps towards implementing something that helps me with the autocomplete. I also modified the file input method so that it now takes files with multiple sequential words instead of a word list of names. I'm now able to print out the words and also get information about their frequency. 

# Lessons learned

Focusing on the right things. A big thing for me was to actually think of the end result wanted with the program. I understand I need something different from a plain name list to get something out of the autocomplete feature.

# What is unclear

Implementing the testing, how to replace the Java structures with structures of my own, how do I create the autocomplete functionality, and how do I implement the frequency checker in relation to certain words (more about this below).

# What will happen next

I'll have to hone the frequency implementation so that I'm able to link the frequencies of a word regarding its position vis a vis another word. So if I have a sentence such as "The who is who of Finnish politicians" I would be able to map 1 for "is" and 1 for "of" as words that follow the word "who". I'll most likely have to implement this in form of an array or a list within the TrieNode in question so that the information within the array can be retrieved by the autocomplete class.