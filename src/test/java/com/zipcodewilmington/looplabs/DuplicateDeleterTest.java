package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public class DuplicateDeleterTest {

    private static Integer[] intArray;
    private static DuplicateDeleter deleter;

    @Before
    public void setup() {
        this.intArray = new Integer[]{1, 1, 1, 20, 21, 23, 23, 45, 45};
        this.deleter = new DuplicateDeleter(intArray);
    }


    @Test
    public void testRemoveDuplicates() {
        Integer[] expected = new Integer[]{20, 21, 23, 23, 45, 45};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates() {
        Integer[] expected = new Integer[]{20, 21, 23, 23, 45, 45};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }
}
