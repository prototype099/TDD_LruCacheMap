/**
 * 
 */
package com.tdd.lrucachemap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author zero
 *
 */
public class LruCacheMapTest {
	
	
	protected LruCacheMap map;

	@Before
	public void setUp() {
		map = new LruCacheMap();
	}
	
	@Test
	public void testCanPut() throws Exception {
		String key = "key";
		String value = "value";
		
		map.put(key, value);
		assertEquals(value, map.get(key));
	}
	
	@Test
	public void testCanPut_Null() throws Exception {
		map.put("key", null);
	}
	
	@Test
	public void testPutKeyCannotBeNull() throws Exception {
		try{
			map.put(null, "value");
			fail();
		}catch (NotAllowNullException e) {
			
		}
	}
	
	@Test
	public void testGetKeyCannotBeNull() throws Exception {
		try {
			map.get(null);
			fail();
		} catch (NotAllowNullException e) {
			
		}
	}
	
	@Test
	public void testCanPut_SameKey_ReplaceValue() throws Exception {
		String key = "key";
		String value1 = "hoge";
		String value2 = "fuga";
		
		map.put(key, value1);
		assertEquals(value1, map.get(key));
		map.put(key, value2);
		assertEquals(value2, map.get(key));
		
	}
	
	@Test
	public void testReturnNull_KeyNotFound() throws Exception {
		assertEquals(null, map.get("piyo"));
	}

}
