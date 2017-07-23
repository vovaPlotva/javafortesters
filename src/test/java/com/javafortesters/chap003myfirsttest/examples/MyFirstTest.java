/**
 * Created by vgolikov on 06-Sep-16.
 */
package com.javafortesters.chap003myfirsttest.examples;
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

        public class MyFirstTest {

            @Test
            public void canAddTwoPlusTwo(){
                int answer = 2+2;
                assertEquals("2+2=5", 4, answer );
        }
    }

