package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/26/18.
 */
public class ArrayUtilsTest {
    @Test
    public void printRandomArrayDeclaration() {
        Integer[] intArray = RandomUtils.createIntegers(0, 25, 50);
        Arrays.sort(intArray);

        System.out.println("Integer[] intArray = new Integer[]" + Arrays.toString(intArray)
                .replace("[", "{")
                .replace("]", "}") + ";");
    }


    @Test
    public void testGetNumberOfOccurences() {
        Integer[] intArray = {0, 1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 5};
        int expected = 5;
        int value = 1;

        testGetNumberOfOccurences(intArray, value, expected);
    }


    @Test
    public void testGetNumberOfOccurences1() {
        Integer[] intArray = {0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4};
        int expected = 5;
        int value = 2;

        testGetNumberOfOccurences(intArray, value, expected);
    }



    @Test
    public void testRemoveValue() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 4, 5, 5, 5};
        int valToRemove = 3;
        testRemoveValue(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValue1() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 3, 3, 3, 4, 5, 5, 5};
        int valToRemove = 2;
        testRemoveValue(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValue2() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 3, 3, 3, 4};
        int valToRemove = 5;
        testRemoveValue(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValue3() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 3, 3, 3, 5, 5, 5};
        int valToRemove = 4;
        testRemoveValue(intArray, valToRemove, expected);
    }











    // ----------------------------- Helper Methods ----------------------------- \\

    private static void testRemoveValue(Integer[] intArray, int valToRemove, Integer[] expected) {
        String actualString = Arrays.toString(ArrayUtils.removeValue(intArray, valToRemove));
        String expectedString  = Arrays.toString(expected);
        Assert.assertEquals(expectedString,actualString);
    }

    private static void testGetNumberOfOccurences(Integer[] intArray, int value, int expected) {
        int actual = ArrayUtils.getNumberOfOccurences(intArray, value);
        Assert.assertEquals(expected, actual);
    }
}