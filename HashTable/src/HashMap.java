/*
 * Requirements for the project
 *  1: put(key, value): Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value
 *  2: get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
 *  3: remove(key): Remove the mapping for the value key if this map contains the mapping for the key
 */
import java.util.Vector;
public class HashMap {
    /* We know that the range will be from [1,1000000]
     * Size of a vector is the number of elements it CONTAINS
     * Capacity is the amount of space that the vector is currently using
     * This means that although the capacity is 100, the size of the vector is 0 at the start
     * Since there are no values stored so far
     * Capacity is the number of buckets
     * InitialCapacity is the capacity of HashMap instance when it is created
     */
    private Vector<Integer> v;
    public HashMap() {
        v = new Vector<Integer>(1000000);
        v.setSize(1000000);
    }
    private int hashIndex(int key){
        return key%v.size();
    }
    public void put(int key, int value) {
        if(v.elementAt(hashIndex(key))==null){
            v.set(hashIndex(key), value);
        }
        //Update the value
        else{
            v.set(hashIndex(key), value);
        }
    }
    public int get(int key) {
        if(v.elementAt(hashIndex(key))!=null){
            return v.elementAt(hashIndex(key));
        } else {
            return -1;
        }
    }
    public void remove(int key) {
        // Use set instead of the remove function
        // Remove function will decrease the size of the function
        // Using set in this case will maintain the vector's size
        v.set(hashIndex(key), null);
    }
    public static void main(String[] args) {
        HashMap m = new HashMap();
        HashMap n = new HashMap();
        n.put(4, 23);
        m.put(4, 55);
        System.out.println(n.get(4));
        System.out.println(m.get(4));
    }
}
