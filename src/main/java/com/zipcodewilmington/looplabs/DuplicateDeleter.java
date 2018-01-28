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

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] arrayCopy = intArray.clone();
        for(int i=arrayCopy.length; i>maxNumberOfDuplications; i--) {
            arrayCopy = removeDuplicatesExactly(i);
        }
        return arrayCopy;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] arrayCopy = intArray.clone();

        for(int i=0; i<arrayCopy.length;i++) {
            int currentValue = arrayCopy[i];
            int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(arrayCopy, currentValue);

            if(numberOfOccurrences == exactNumberOfDuplications) {
                arrayCopy = ArrayUtils.removeValue(arrayCopy, currentValue);
            }
        }
        return arrayCopy;
    }
}