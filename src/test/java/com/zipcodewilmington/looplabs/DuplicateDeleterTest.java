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
        this.intArray = new Integer[]{1, 1, 1, 23, 45, 23, 45, 20, 21, };
        this.deleter = new DuplicateDeleter(intArray);
    }


    @Test
    public void testRemoveDuplicates() {
        Integer[] expected = new Integer[]{23, 45, 23, 45, 20};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfOccurences() {
        int expected = 3;
        int actual = ArrayUtils.getNumberOfOccurences(intArray, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        int maxNumberOfOccurrences = 2;
        Integer[] input = new Integer[]{1, 1, 1, 23, 45, 23, 45, 20};
        DuplicateDeleter deleter = new DuplicateDeleter(input);
        Integer[] result = deleter.removeDuplicates(maxNumberOfOccurrences);

        System.out.println("Max Number of Duplications = " + maxNumberOfOccurrences);
        System.out.println("Input array:\n\t" + Arrays.toString(input));
        System.out.println("\nResulting array:\n\t" + Arrays.toString(result));
    }


    @Test
    public void testRandom() {
        int maxNumberOfOccurrences = 2;
        int minVal = 1;
        int maxVal = 9;
        Integer[] input = RandomUtils.createIntegers(minVal, maxVal, maxVal * 2);
        DuplicateDeleter deleter = new DuplicateDeleter(input);
        Integer[] result = deleter.removeDuplicates(maxNumberOfOccurrences);

        System.out.println("Max Number of Duplications = " + maxNumberOfOccurrences);
        System.out.println("Input array:\n\t" + Arrays.toString(input));
        System.out.println("\nResulting array:\n\t" + Arrays.toString(result));
    }
}
