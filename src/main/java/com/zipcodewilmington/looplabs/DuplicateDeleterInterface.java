package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 */
public interface DuplicateDeleterInterface<T> {
    T[] removeDuplicates(int maxNumberOfDuplications);
    T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}