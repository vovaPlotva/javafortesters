package com.javafortesters.chap010interfaces.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vgolikov on 28-Jun-17.
 */
public class Lists {

    @Test
    public void getAnElementAtAnIndex(){
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
    }

}
