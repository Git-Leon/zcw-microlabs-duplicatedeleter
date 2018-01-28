package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/25/18.
 */
@SuppressWarnings("ALL")
public class DuplicateDeleter {
    private final Integer[] intArray;

    public DuplicateDeleter(Integer[] intArray) {
        this.intArray = intArray;
    }

    public Integer[] removeDuplicates(int exactNumberOfOccurrences) {
        Integer[] arrayCopy = intArray.clone();

        for (int i = 0; i < arrayCopy.length; i++) {
            int currentValue = arrayCopy[i];
            int numberOfOccurences = ArrayUtils.getNumberOfOccurences(intArray, currentValue);

            if (numberOfOccurences == exactNumberOfOccurrences) {
                arrayCopy = removeValue(arrayCopy, currentValue);
            }
        }
        return arrayCopy;
    }

    private Integer[] removeValue(Integer[] arrayCopy, int valToRemove) {
        int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(arrayCopy, valToRemove);
        int newArrayLength = arrayCopy.length - numberOfOccurrences;
        Integer[] newArray = new Integer[newArrayLength];

        for (int i = 0; i < newArrayLength; i++) {
            int currentValue = arrayCopy[i];

            if (currentValue != valToRemove) {
                newArray[i] = currentValue;
            }
        }

        verifyContents(newArray);
        return newArray;
    }

    private void verifyContents(Integer[] intArray) {
        assert !ArrayUtils.contains(intArray, null);
    }

    public Integer[] removeDuplicatesExactly(int i) {
        return new Integer[0];
    }
}