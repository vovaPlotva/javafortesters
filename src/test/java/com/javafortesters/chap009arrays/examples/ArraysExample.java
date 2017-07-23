package com.javafortesters.chap009arrays.examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;


/**
 * Created by vgolikov on 20-Jun-17.
 */
public class ArraysExample {

    public void print2DIntArray(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    @Before
    public void letsPrintArray() {
        int[][] newArray = new int[16][];
        for (int i = 0; i < 16; i++) {
            newArray[i] = new int[i + 1];
        }
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = j;
            }
        }
        print2DIntArray(newArray);
    }


    @Test
    public void arrayMethod() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekDays = Arrays.copyOf(workdays, 7);

        assertEquals(null, weekDays[5]);
        assertEquals(null, weekDays[6]);

        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";


    }


}
