package com.coreJava;

import java.util.LinkedHashMap;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = 1L;

	private final int capecity;

	public LRUCache(int capecity) {
		super(capecity+1, 1.1f, true);
		this.capecity = capecity;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > capecity;
	}
}

public class LRUCacheUsingLinkedHashMapTest {
	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<>(3);
		cache.put(1, "aaa");
		cache.put(2, "bbb");
		cache.put(3, "ccc");
		System.out.println(cache);

		cache.put(4, "ddd");
		cache.put(5, "eee");
		System.out.println(cache);
	}
}