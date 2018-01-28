package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 */
public interface DuplicateDeleterInterface<T> {
    DuplicateDeleterInterface<T> removeDuplicates(int maxNumberOfDuplications);

    DuplicateDeleterInterface<T> removeDuplicatesExactly(int exactNumberOfDuplications);
}
