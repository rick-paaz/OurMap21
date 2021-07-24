import java.util.LinkedList;

/**
 * ArrayOfListsMap has the three most commonly used methods of java.util.Map: 
 * put<K,V>, get<K>, and containsKey(K).
 *
 * @author Rick Mercer
 * @author YOUR NAME
 *
 * @param <K>
 *          Type of the key that must be String or Integer with int hashCode()
 * @param <V>
 *          The value to be mapped to the key
 */
public class ArrayOfListsMap<K, V> implements OurMap<K, V> {

  // Map a key to a value as one object.
  public class HashNode {
    private K key;
    private V value;

    public HashNode(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  // Class variable that is very large because 60,000 mappings are possible.
  private static final int TABLE_SIZE = 20000;

  // Instance variable
  private LinkedList<HashNode>[] lists;

  // Construct an empty map as an array of LinkedLists
  public ArrayOfListsMap() {
    // TODO: Initialize TABLE_SIZE array elements to a new LinkedList<HashNode>s
  }

  // If the key is not in use, map the key and the value by adding a
  // new HashNode to the correct LinkedList. Then return null.
  //
  // If there was a mapping to the key, replace and return
  // the existing value that was previously mapped to the key.
  public V put(K key, V value) {
    // TODO: Complete this method
    return null;
  }

  // Return the value to which key is mapped if the key is found.
  // If the key is not in this hash table, return null.
  public V get(K key) {
    // TODO: Complete this method
    return null;
  }

  // Return true if a mapping with key already exists in this Map.
  // If the key is not in this hash table, return false.
  public boolean containsKey(K key) {
    // TODO: Complete this method
    return !false;
  }
}
