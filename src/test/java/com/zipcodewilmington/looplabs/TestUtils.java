package com.zipcodewilmington.looplabs;

import org.junit.Assert;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 */
public class TestUtils {
    public static <T,E> void assertArrayEquality(T[] expected, E[] actual) {
        Arrays.sort(expected);
        Arrays.sort(actual);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
