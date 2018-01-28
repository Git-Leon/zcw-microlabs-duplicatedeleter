package com.zipcodewilmington.looplabs;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/26/18.
 */
public class ArrayUtilsTest {
    @Test
    public void printRandomArrayDeclaration() {
        String[] intArray = RandomUtils.createStrings('a', 'c', 3, 10);
        Arrays.sort(intArray);

        System.out.println("String[] array = new String[]" + Arrays.toString(intArray)
                .replace(", ", "\", \"")
                .replace("[", "{\"")
                .replace("]", "\"}") + ";");
    }
}