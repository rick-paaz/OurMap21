import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayOfListsMapTest {
  
  @Test
  public void testingPutGetWhenKeyDoesNotExist() {   
    ArrayOfListsMap<Integer, String> map = new ArrayOfListsMap<Integer, String>();
    assertNull(map.put(1, "A"));
    assertNull(map.put(2, "B"));
    assertNull(map.put(3, "C"));
    assertEquals("A", map.get(1));
    assertEquals("B", map.get(2));
    assertEquals("C", map.get(3));
  }
  
  @Test
  public void testingPutGetWhenKeyExists() {   
    ArrayOfListsMap<Integer, String> map = new ArrayOfListsMap<Integer, String>();
    assertNull(map.put(1, "A"));
    assertNull(map.put(2, "Gone"));
    assertNull(map.put(3, "Replaced"));
    assertEquals("Gone", map.put(2, "NewValue"));
    assertEquals("Replaced", map.put(3, "AnotherNewValue"));
    assertEquals("A", map.get(1));
    assertEquals("NewValue", map.get(2));
    assertEquals("AnotherNewValue", map.get(3));
  }

  @Test
  public void testingPutAndContainsKey() {
    ArrayOfListsMap<String, Integer> map = new ArrayOfListsMap<String, Integer>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
    assertTrue(map.containsKey("A"));
    assertTrue(map.containsKey("B"));
    assertTrue(map.containsKey("C"));   

    assertFalse(map.containsKey("a"));
    assertFalse(map.containsKey("X"));
    assertFalse(map.containsKey("12"));
  }

  @Test
  public void tesGetReturnsNullWhenTheKeyDoesNotExists() {
    ArrayOfListsMap<String, Integer> map = new ArrayOfListsMap<String, Integer>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
    assertNull(map.get("xx"));
    assertNull(map.get("b"));
    assertNull(map.get("nothere"));
  }
}
