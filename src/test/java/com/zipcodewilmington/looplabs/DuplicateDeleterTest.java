package com.zipcodewilmington.looplabs;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/25/18.
 * @ATTENTION_TO_STUDENTS - You are forbidden from editing this class.
 */
public class DuplicateDeleterTest {

    private static Integer[] intArray;
    private static DuplicateDeleter<Integer> deleter;

    @Before
    public void setup() {
        this.intArray = new Integer[]{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};
        this.deleter = new DuplicateDeleter(intArray);
    }


    @Test
    public void testRemoveDuplicates() {
        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates1() {
        Integer[] expected = new Integer[]{0, 0, 0, 1, 5, 5, 5, 6, 9, 9, 9};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        TestUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void testRemoveDuplicates2() {
        Integer[] expected = new Integer[]{0, 0, 0, 2, 2, 4, 4, 5, 5, 5, 9, 9, 9};
        Integer[] actual = deleter.removeDuplicatesExactly(1);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates3() {
        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        deleter.removeDuplicates(3);
        deleter.removeDuplicatesExactly(2);
        deleter.removeDuplicatesExactly(1);

        Integer[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }
}
