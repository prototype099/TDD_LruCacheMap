package com.tdd.lrucachemap;

import java.util.HashMap;
import java.util.Map;

public class LruCacheMap {

	private Map<String, String> map = new HashMap<String, String>();
	
	public void put(String key, String value) throws NotAllowNullException {
		if (key == null)
			throw new NotAllowNullException();
		
		map.put(key, value);
	}

	public String get(String key) throws NotAllowNullException {
		if (key == null)
			throw new NotAllowNullException();
		
		return map.get(key);
	}

}
