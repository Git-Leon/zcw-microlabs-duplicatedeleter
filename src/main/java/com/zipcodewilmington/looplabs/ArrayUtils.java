package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public class ArrayUtils<T> {

    public static <T> int getNumberOfOccurences(T[] objectArray, T value) {
        int occurrences = 0;
        for (T val : objectArray) {
            boolean sameValue = val.equals(value);
            if (sameValue) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static <T> T[] removeValue(T[] array, T valToRemove) {
        int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(array, valToRemove);
        int newArrayLength = array.length - numberOfOccurrences;
        T[] newArray = Arrays.copyOf(array, newArrayLength); // prevents casting issues

        for (int i = 0, j = 0; j < newArrayLength; i++) {
            T currentValue = array[i];

            if (!currentValue.equals(valToRemove)) {
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
