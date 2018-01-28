package com.zipcodewilmington.looplabs;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/28/18.
 */
public class StringDuplicateDeleterTest {

    private static String[] stringArray;
    private static volatile DuplicateDeleter<String> deleter;

    @Before
    public void setup() {
        this.stringArray = new String[]{"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        this.deleter = new StringDuplicateDeleter(stringArray);
    }


    @Test
    public void testRemoveDuplicates1() {
        String[] expected = new String[]{"aba", "aba", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(1);
        TestUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void testRemoveDuplicates2() {
        String[] expected = new String[]{"baa", "bab", "bba", "bba", "bba", "bba"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        TestUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void testRemoveDuplicates3() {
        String[] expected = new String[]{"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }



    @Test
    public void testRemoveDuplicates4() {
        String[] expected = new String[]{"aba", "aba", "baa", "bab", "bbb", "bbb"};
        String[] actual = deleter.removeDuplicatesExactly(4);
        TestUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void testRemoveDuplicates5() {
        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        deleter.removeDuplicates(3);
        deleter.removeDuplicatesExactly(2);
        deleter.removeDuplicatesExactly(1);

        String[] actual = deleter.removeDuplicatesExactly(3);
        TestUtils.assertArrayEquality(expected, actual);
    }
}
