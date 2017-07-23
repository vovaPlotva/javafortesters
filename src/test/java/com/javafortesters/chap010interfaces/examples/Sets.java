package com.javafortesters.chap010interfaces.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vgolikov on 28-Jun-17.
 */
public class Sets {

    @Test
    public void setDoesNotAllowDuplicateElements() {
        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

}
