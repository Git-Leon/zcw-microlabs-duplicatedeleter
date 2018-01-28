package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    public DuplicateDeleter<T> removeDuplicates(int maxNumberOfDuplications) {
        T[] arrayCopy = array.clone();
        for (int i = arrayCopy.length; i > maxNumberOfDuplications; i--) {
            arrayCopy = removeDuplicatesExactly(i).getArray();
        }
        return new DuplicateDeleter<T>(arrayCopy);
    }

    public DuplicateDeleter<T> removeDuplicatesExactly(int exactNumberOfDuplications) {
        T[] arrayCopy = array.clone();
        for (T currentValue : arrayCopy) {
            int numberOfOccurrences = ArrayUtils.getNumberOfOccurences(arrayCopy, currentValue);

            if (numberOfOccurrences == exactNumberOfDuplications) {
                arrayCopy = ArrayUtils.removeValue(arrayCopy, currentValue);
            }
        }
        return new DuplicateDeleter<T>(arrayCopy);
    }

    public T[] getArray() {
        return array;
    }
}