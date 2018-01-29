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
        Integer[] intArray = RandomUtils.createIntegers(0, 6, 15);
        Arrays.sort(intArray);

        System.out.println("Integer[] array = new Integer[]" + Arrays.toString(intArray)
                .replace("[", "{")
                .replace("]", "}") + ";");
    }

    @Test
    public void printRandomArrayDeclarationString() {
        String[] intArray = RandomUtils.createStrings('a',  'c', 2, 15);
        Arrays.sort(intArray);

        System.out.println("String[] intArray = new String[]" + Arrays.toString(intArray)
                .replace(", ", "\", \"")
                .replace("[", "{\"")
                .replace("]", "\"}") + ";");
    }


    @Test
    public void testGetNumberOfOccurences() {
        String[] intArray = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        int expected = 5;
        String value = "aa";

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
    public void testRemoveValueIntegerArray() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 4, 5, 5, 5};
        int valToRemove = 3;
        testRemoveValueIntegerArray(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValueIntegerArray1() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 3, 3, 3, 4, 5, 5, 5};
        int valToRemove = 2;
        testRemoveValueIntegerArray(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValueIntegerArray2() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 3, 3, 3, 4};
        int valToRemove = 5;
        testRemoveValueIntegerArray(intArray, valToRemove, expected);
    }

    @Test
    public void testRemoveValueIntegerArray3() {
        Integer[] intArray = {0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        Integer[] expected = {0, 0, 1, 2, 2, 3, 3, 3, 5, 5, 5};
        int valToRemove = 4;
        testRemoveValueIntegerArray(intArray, valToRemove, expected);
    }


    @Test
    public void testRemoveValueStringArray1() {
        String[] stringArray = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        String[] expected = new String[]{"ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        String valToRemove = "aa";
        testRemoveValueIntegerArray(stringArray, valToRemove, expected);
    }




    @Test
    public void testRemoveValueStringArray2() {
        String[] stringArray = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba", "bb", "bb", "bb", "bb", "bb"};
        String[] expected = new String[]{"aa", "aa", "aa", "aa", "aa", "ab", "ba", "ba", "ba", "ba" };
        String valToRemove = "bb";
        testRemoveValueIntegerArray(stringArray, valToRemove, expected);
    }











    // ----------------------------- Helper Methods ----------------------------- \\

    private static void testRemoveValueIntegerArray(Object[] intArray, Object valToRemove, Object[] expected) {
        String actualString = Arrays.toString(ArrayUtils.removeValue(intArray, valToRemove));
        String expectedString  = Arrays.toString(expected);
        Assert.assertEquals(expectedString,actualString);
    }

    private static void testGetNumberOfOccurences(Object[] intArray, Object value, int expected) {
        int actual = ArrayUtils.getNumberOfOccurences(intArray, value);
        Assert.assertEquals(expected, actual);
    }
}