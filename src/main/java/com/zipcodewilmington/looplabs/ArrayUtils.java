package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public class ArrayUtils<T> {

    public static <T> int getNumberOfOccurences(T[] objectArray, T value) {
        T[] arrayCopy = objectArray.clone();
        int occurrences = 0;
        for (T val : arrayCopy) {
            boolean sameValue = val == value;
            if (sameValue) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static <T> T[] removeValue(T[] array, T valToRemove) {
        int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(array, valToRemove);
        int newArrayLength = array.length - numberOfOccurrences;
        T[] newArray = (T[]) new Object[newArrayLength];

        for (int i = 0, j = 0; j < newArrayLength; i++) {
            T currentValue = array[i];

            if (currentValue != valToRemove) {
                newArray[j] = currentValue;
                j++;
            }
        }
        return newArray;
    }


    public static <T> boolean contains(T[] objectArray, T value) {
        return getNumberOfOccurences(objectArray, value) > 0;
    }
}
