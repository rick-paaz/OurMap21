/**
 * OurMap has three of the major methods of java.util.Map: put<K,V>, get<K>, and
 * containsKey(K)
 *
 * @author Rick Mercer
 *
 * @param <K>
 *          The key for each mapping. This must be Integer or String.
 * @param <V>
 *          The value that gets mapped to K key.
 */
public interface OurMap<K, V> {

  // If the key is not in use, map the key and the value by adding a
  // new HashNode to the correct LinkedList. Then return null.
  //
  // If there was a mapping to the key, replace and return
  // the existing value that was previously mapped to the key.
  public V put(K key, V value);

  // Return the value to which key is mapped if the key is found.
  // If the key is not in this hash table, return false.
  public V get(K key);

  // Return true if a mapping with key already exists in this Map.
  // If the key is not in this hash table, return false.
  public boolean containsKey(K key);
}