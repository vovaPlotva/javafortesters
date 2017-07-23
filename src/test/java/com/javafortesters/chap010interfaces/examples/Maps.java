package com.javafortesters.chap010interfaces.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

/**
 * Created by vgolikov on 28-Jun-17.
 */
public class Maps {

    @Test
    public void putSomeValuesToTheMap() {
        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertEquals(3, map.size());

        map.put("key1", "newvalue1");
        assertEquals("newvalue1", map.get("key1"));

        assertEquals(null, map.get("key4"));

        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());

        Collection<String> values = map.values();
        Set<String> keys = map.keySet();

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for( Map.Entry<String,String> entry : entries){
            entry.setValue("bob");
        }






    }
}
