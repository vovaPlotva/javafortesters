package com.javafortesters.chap011exceptions.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vgolikov on 29-Jun-17.
 */
public class LetsCatchExceptions {

    @Test
    public void throwANullPointerException() {
        Integer age = 18;
        String ageAsString = age.toString();
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {

            age = 18;
            ageAsString = age.toString();

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " +
                    e.getMessage());
        } finally {
            yourAge = "You are " + age.toString() + " years old";
        }

        assertEquals("You are 18 years old", yourAge);

    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        age.toString();
    }

    @Test
    public void catchCustomException() {
        try {
            User wrongPassUser = new User("Mike", "12345");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " +
                    e.getMessage());
        }

    }



}
