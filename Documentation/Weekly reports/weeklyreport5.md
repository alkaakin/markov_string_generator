## Weekly report pt. 5

# What's been done this week

I haven't really had the time to make any progress with the program this week. 

# Advances with the program

As said, no real progress has happened. I've written some pseudocode but unfortunately I've had time restraints that have hindered any meaningful changes to the code. 

# Lessons learned

I've learned something this week despite of lack of progress made. Last week I replaced the filereader method with a new method that is able to read a text file in form of a story or a text input other than a plain name list. A name list wouldn't have been optimal for a text prediction algorithm. The pseudocode I wrote this week contains an idea of adding a HashMap ConnectionMap to those TrieNodes that represents the last letter of a word. ConnectionMap holds a string that follows the word as a key and maps the number of times (int) that string follows the word in the text as values to those keys. 

With the above information, the next step would be to split the initial text file to an array holding all of the words of the file. Then the list needs to be given to the filereader as "tuples" so that the first two words are first given to the filereader. Word2 will be marked as following word1. After these words have been handled, word2 and word3 will be given to the reader, and so on. This way we would be able to map all of the occurrences of words to the trie.

# What is unclear

-

# What will happen next

I'll continue implementing the program and will find out if I have any chance of completing the course. If not, I will try to complete it in the next period with the program I've been working on.