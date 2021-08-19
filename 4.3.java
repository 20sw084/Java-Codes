public class Class2 {
public static void main(String args[]) {
  // Declare the String that is to be sorted:
  String text = "Into the face of the young man who sat on the terrace " +
                "of the Hotel Magnifique at Cannes crept a look of furtive " +
                "shame, the shifty, hangdog look which announces that " +
                "an Englishman is about to talk French." ;


  // Determine how many words there are.
  // A word is a sequence of letters that may include a single quote character.
  // Anything else is punctuation or spaces.
  int count = 0;	                                                   // Counts number of words
  boolean isWord = false;                                            // Indicates start of a word found
  for (int i = 0 ; i < text.length() ; ++i) {
    if(isWord) {                                                     // If we have found a word...
      if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
        continue;                                                    // ...pass over letters or single quote
      else                                                           // It is not a letter or single quote...
        isWord = false;                                              // so we have come to the end of the word
    }
    else if(Character.isLetter(text.charAt(i))) {
                                                                     // We have the first letter of a new word
        count++;                                                     // so increment word count
        isWord = true;                                                // and record we have found a word
    }
  }

  // Create the array of strings to contain all the words:
  String[] words = new String[count];

  // Now extract the words from the text
  int start = 0;                                                     // Position of first letter of a word
  int wordIndex = 0;                                                 // Current vacant words array element
  isWord = false;                                                    // Indicates when a word start is found
  for (int i = 0 ; i < text.length() ; ++i) {
    if(!isWord) {                                                    // If we are not in a word...
      if(Character.isLetter(text.charAt(i))) {                       // look for first letter of a word.
        start = i;                                                   // Record word start index
        isWord = true;                                               // We have a word
      }
    }
    else {                                                           // We are in a word
      if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
        continue;                                                    // Still the same word so continue
      else {                                                         // It is the end of the word
        isWord = false;                                              // so reset word indicator
        words[wordIndex++] = text.substring(start,i);                // and extract the word
      }
    }
  }
  // If the text ends with a letter, we will not have stored the last word
  if(wordIndex < words.length)
    words[wordIndex] = text.substring(start);

  // Sort the array of words
  String temp = null;                                                // Stores a word reference
  boolean exchange = true;                                           // Indicate we exchanged a pair of words
  while(exchange) {
    exchange = false;                                                // No exchange so far
    for(int i = 1 ; i < words.length ; ++i) {                        // For each word starting with the second
      if(words[i-1].compareTo(words[i]) > 0) {                       // If the previous word is greater
        temp = words[i];                                             // exchange them
        words[i] = words[i-1];
        words[i-1] = temp;
        exchange = true;                                             // and record that exchange occurred
      }
    }
  }

  // Display the sorted array of words:
  for(String word : words) {
    System.out.println(word);
  }
}
}

