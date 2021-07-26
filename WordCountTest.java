import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Write the code that stores all words in a list as keys in a map and the how
 * often that word exists in the list. See assertions below for an example.
 * 
 * @author Rick Mercer
 * @author YOUR NAME
 *
 */
public class WordCountTest {

  // Add the code to this test method to store mappings of every unique word in
  // the List as the keys, and the number of times that word occurs as the value
  @Test
  public void testUsingMapToCountWords() {
    List<String> list = new ArrayList<String>();
    list.add("how");
    list.add("much");
    list.add("wood");
    list.add("a");
    list.add("woodchuck");
    list.add("chuck");
    list.add("a");
    list.add("woodchuck");
    list.add("chuck");

    ArrayOfListsMap<String, Integer> wordCount = new ArrayOfListsMap<>();
    // TODO: Finish the code to set up the HashMap so all assertions pass. 
    // This is when put(key, value) replacing the value if the key exits must be used.
    
    
    // There should be 6 mappings
    assertEquals(1, (int)wordCount.get("how"));
    assertEquals(1, (int)wordCount.get("much"));
    assertEquals(1, (int)wordCount.get("wood"));
    assertEquals(2, (int)wordCount.get("a"));
    assertEquals(2, (int)wordCount.get("woodchuck"));
    assertEquals(2, (int)wordCount.get("chuck"));
    assertNull(wordCount.get("NotHere"));
  }
}
