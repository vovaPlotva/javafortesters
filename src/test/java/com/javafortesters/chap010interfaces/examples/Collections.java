package com.javafortesters.chap010interfaces.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vgolikov on 27-Jun-17.
 */
public class Collections {

    @Test
    public void collectionCount() {
        Collection<String> workdays = new ArrayList<String>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertEquals(5, workdays.size());

        Collection<String> daysOfWeek = new ArrayList<String>();
        daysOfWeek.addAll(workdays);

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }

        assertEquals(workdays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workdays));

        daysOfWeek.clear();

        assertEquals(0, daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());

    }
}
