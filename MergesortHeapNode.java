/**
 * A MergesortHeapNode has a key and an index that indicates
 * which subarray that key came from.
 * 
 * @author Donald Chinn
 * @version September 19, 2003
 */
public class MergesortHeapNode implements Comparable {
    int key;            // the data
    int whichSubarray;  // which subarray the data came from
    
    /**
     * Constructor.
     * @param key   the key value
     * @param whichSubarray     which subarray (0..k-1) the data is from in
     *                          k-way mergesort
     */
    public MergesortHeapNode (int key, int whichSubarray) {
        this.key = key;
        this.whichSubarray = whichSubarray;
    }
    
    
    // Accessor methods
    public int getKey() {
        return key;
    }
    
    public int getWhichSubarray() {
        return whichSubarray;
    }
    
    
    /**
     * Implements the compareTo method.
     * @param rhs the other MergesortHeapNode object.
     * @return 0 if two objects are equal;
     *     less than zero if this object is smaller;
     *     greater than zero if this object is larger.
     * @exception ClassCastException if rhs is not a MergesortHeapNode.
     */
    public int compareTo (Object rhs) {
        if (this.key < ((MergesortHeapNode) rhs).key) {
            return -1;
        } else if (this.key == ((MergesortHeapNode) rhs).key) {
            return 0;
        } else {
            return 1;
        }
    }
}