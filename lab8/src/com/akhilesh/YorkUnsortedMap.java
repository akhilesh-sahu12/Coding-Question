package com.akhilesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class YorkUnsortedMap<K, V> implements Map<K, V> {
	/*public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}*/

	// -------------- nested MapEntry Class ------------------
	private static class MapEntry<K, V> implements Entry<K, V> {
		private K key;
		private V value;
		MapEntry<K,V>next;

		/**
		 * Constructor to set the key and value of this entry
		 * 
		 * @param key   the key
		 * @param value the value
		 */
		public MapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			// TODO: Your implementation of this method starts here
			return this.key;
		}

		@Override
		public V getValue() {
			// TODO: Your implementation of this method starts here
			return this.value;
			
		}

		/**
		 * Sets the value of this Entry with specified value
		 * 
		 * @param newValue the new value
		 * @return old value of this entry
		 */
		public V setValue(V newValue) {
			// TODO: Your implementation of this method starts here
			V oldValue = value;
			value = newValue;
			return oldValue;
		}

		/**
		 * String representation for map entry
		 */
		@Override
		public String toString() {
			return "<" + key + ", " + value + ">";
		}

	}

	// ---- end of nested MapEntry class----------------------
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// Define default load factor
	private static final double LOADFACTOR = 0.5;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// Define the default hash-table size. Must be a power of 2
	private static final int INITCAPACITY = 4;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// Define the maximum hash-table size. 1 << 30 is same as 2^30
	private static final int MAXCAPACITY = 1 << 30;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// The current hash-table capacity. Capacity must be a power of 2
	private int capacity;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// User specify a load factor used in this hash table
	private double loadFactor;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	// The number of entries in the map
	private int size = 0;

	/**
	 * Add any other private data members or methods that are necessary to manage
	 * the YorkUnsortedMap You can use java.util.ArrayList or java.util.LinkedList
	 * (DoublyLinked) List to implement and store the map entries
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private List<MapEntry<K, V>> entries;

	/**
	 * no argument constructor Construct a map with the default capacity and load
	 * factor
	 */
	public YorkUnsortedMap() {
		// TODO: Your implementation of this method starts here
		capacity=INITCAPACITY;
		loadFactor=LOADFACTOR;
	}

	/*private void initbucket(int capacity) {
		entries=new LinkedList<>(capacity);
		for (int bi=0; bi<entries.size(); bi++){
			entries=new LinkedList<>();
		}
	}*/


	/**
	 * One argument constructor Construct a map with the specified initial capacity
	 * and default load factor
	 */
	public YorkUnsortedMap(int capacity) {
	//	this();
		this.capacity=nextPowerOf2s(capacity);
		this.loadFactor=LOADFACTOR;

	}

	private int nextPowerOf2s(int n) {
		int p = 1;
		if (n > 0 && (n & (n - 1)) == 0)
			return n;

		while (p < n)
			p <<= 1;

		return p;

	}

	/**
	 * Construct a map with the specified initial capacity and load factor. Note:
	 * the capacity of map must be power of 2 User/client can specify any value as
	 * map capacity. You should make sure that the map is created with the power of
	 * 2 capacity that is greater than the user's given capacity. For example, if
	 * the user specifies the input capacity as 13, you should create a map with a
	 * capacity of 16.
	 * 
	 * @param capacity   map capacity specified by client
	 * @param loadFactor map loading factor
	 */
	public YorkUnsortedMap(int capacity, double loadFactor) {
		// TODO: Your implementation of this method starts here
	//	this(capacity);
	    this.capacity=nextPowerOf2s(capacity);
		this.loadFactor=loadFactor;
	}

	@Override
	public int size() {
		// TODO: Your implementation of this method starts here
		return size;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO: Your implementation of this method starts here
		return this.size==0;
		
	}

	@Override
	public V get(K key) throws NullPointerException {
		// TODO: Your implementation of this method starts here
		int hash_value=hashFun(key);
		MapEntry<K,V> curr=entries.get(hash_value);
		if(curr!=null){
			if(curr.key.equals(key))
				curr=curr.next;
			return curr.value;

		}
		return null;
	}
	@Override
	public void clear() {
		// TODO: Your implementation of this method starts here
        entries.clear();
		size=0;
	}

	@Override
	public V put(K key, V value) throws NullPointerException {
		// TODO: Your implementation of this method starts here
		int hash_value = hashFun(key);


		if (!isEmpty()) {
		//	MapEntry<K, V> curr = entries.get(hash_value);
			if (entries.get(hash_value).key.equals(key))
			entries.get(hash_value).value = value;
			return entries.get(hash_value).value;
		} else {
			//MapEntry<K, V> curr = entries.get(hash_value);
			//curr = entries.get(hash_value);
			MapEntry<K, V> node = new MapEntry<K, V>(key, value);
			node.next = entries.get(hash_value);
			size++;
			loadFactor = (double) size / capacity;
			if (loadFactor >= 0.5)
				rehash();
			return node.value;
		}
	}
		/*double lambda=size*1.0/entries.size();
		if(lambda>2.0){
			rehash();
		}*/



	private void rehash()  throws NullPointerException {
		List<MapEntry<K,V>>temp=entries;
		entries=new ArrayList<>();
		for (int i=0; i<2*capacity;i++){
			entries.add(null);
		}
		size=0;
		capacity*=2;
		for (MapEntry<K, V> curr : temp) {
			while (curr != null) {
				K key = curr.key;
				V value = curr.value;
				put(key, value);
				curr = curr.next;
			}
		}
	}

	/*private int getIndexWithInd(K key, int hash_value) {
		int di=0;
		for (MapEntry<K,V> node:entries){
			if(node.key.equals(key)){
				return di;
			}
			di++;
		}
		return -1;
	}*/

	private int hashFun(K key) {
		int hashcode=key.hashCode();
		return (hashcode)%capacity;
	}

	@Override
	public V remove(K key) throws NullPointerException {
		// TODO: Your implementation of this method starts here
		int hash_value=hashFun(key);
		MapEntry<K, V> curr = entries.get(hash_value);
		MapEntry<K,V>pre=null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				if (pre == null)
					entries.set(capacity, curr.next);
				else
					pre.next = curr.next;

				size--;
				return curr.value;
			}
			pre = curr;
			curr = curr.next;
		}
		return null;
	}

	@Override
	public boolean containsKey(K key) throws NullPointerException {
		// TODO: Your implementation of this method starts here
		int hash_value = hashFun(key);
		MapEntry<K, V> curr = entries.get(hash_value);
		while (curr != null) {
			if (curr.key.equals(key))
				return true;
		curr = curr.next;
	}
			return false;
		}


	@Override
	public boolean containsValue(V value) {
		// TODO: Your implementation of this method starts here
		for (MapEntry<K, V> entry : entries) {
			if (value.equals(entry)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterable<K> keySet() {
		// TODO: Your implementation of this method starts here
		return (Iterable<K>) entries.listIterator();

	}

	@Override
	public Iterable<V> values() {
		// TODO: Your implementation of this method starts here
		return null;
	}

	@Override
	public Iterable<Entry<K, V>> entrySet() {
		// TODO: Your implementation of this method starts here
		return null;
	}

	/**
	 * Return String value represent the content of map 
	 *  if Map contains only two entries 
	 *  put("A1", 124); and put("A2", 125);
	 *  the output will be 
	 *   "[<A1, 124>,<A2, 125>]"
	 */
	@Override
	public String toString() {

		// TODO: Your implementation of this method starts here
		String str="";
		for (MapEntry<K, V> node : entries) {
		//	String ans="<" + key + ", " + value + ">,";
		//	str.concat(ans);
		}
		return str;

	}
}
