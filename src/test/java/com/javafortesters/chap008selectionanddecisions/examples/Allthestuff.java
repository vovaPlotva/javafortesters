package com.javafortesters.chap008selectionanddecisions.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

/**
 * Created by vgolikov on 09-Jun-17.
 */

public class Allthestuff {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

}


