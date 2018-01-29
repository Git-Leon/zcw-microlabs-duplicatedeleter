package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    private final T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    public T[] removeDuplicates(int maxNumberOfDuplications) {
        T[] arrayCopy = array.clone();
        DuplicateDeleter<T> deleter = new DuplicateDeleter<>(arrayCopy);
        for(int i=arrayCopy.length; i>=maxNumberOfDuplications; i--) {
            arrayCopy = deleter.removeDuplicatesExactly(i);
            deleter = new DuplicateDeleter<>(arrayCopy);
        }
        return deleter.array;
    }

    public T[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        T[] arrayCopy = array.clone();
        for(T currentValue : arrayCopy ) {
            int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(arrayCopy, currentValue);

            if(numberOfOccurrences == exactNumberOfDuplications) {
                arrayCopy = ArrayUtils.removeValue(arrayCopy, currentValue);
            }
        }
        return arrayCopy;
    }
}