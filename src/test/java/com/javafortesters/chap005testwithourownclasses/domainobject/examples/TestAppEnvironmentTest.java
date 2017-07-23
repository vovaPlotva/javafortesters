/**
 * Created by vgolikov on 06-Sep-16.
 */
package com.javafortesters.chap005testwithourownclasses.domainobject.examples;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.javafortesters.domainobject.TestAppEnv;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());


    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain",
                "192.123.0.3",
                TestAppEnv.DOMAIN);
        assertEquals("Just the Port",
                "67",
                TestAppEnv.PORT);

    }

}
