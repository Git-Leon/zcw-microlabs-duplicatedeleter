package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public class DuplicateDeleter<T> {
    private final T[] intArray;

    public DuplicateDeleter(T[] intArray) {
        this.intArray = intArray;
    }

    public T[] removeDuplicates(int maxNumberOfDuplications) {
        T[] arrayCopy = intArray.clone();
        for(int i=arrayCopy.length; i>maxNumberOfDuplications; i--) {
            arrayCopy = removeDuplicatesExactly(i);
        }
        return arrayCopy;
    }

    public T[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        T[] arrayCopy = intArray.clone();
        for(T currentValue : arrayCopy ) {
            int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(arrayCopy, currentValue);

            if(numberOfOccurrences == exactNumberOfDuplications) {
                arrayCopy = ArrayUtils.removeValue(arrayCopy, currentValue);
            }
        }
        return arrayCopy;
    }
}