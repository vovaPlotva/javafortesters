package com.javafortesters.chap012inheritance;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vgolikov on 20-Jul-17.
 */
public class EmptyUser extends User {

    @Test
    public void emptyUserExampleTest(){
        EmptyUser enu = new EmptyUser();
        assertEquals("username", enu.getUsername());
        assertEquals("password", enu.getPassword());
    }

}
