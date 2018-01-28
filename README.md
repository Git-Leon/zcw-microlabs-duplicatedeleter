
# Delete Duplicates 
* **Objective**
	* To write a method which removes duplicate elements from an array.
* **Purpose**
	* To demonstrate practical understanding of while, for, and for each loops.
* **Instructions**
    * Complete the `removeDuplicates` method which takes an argument of an `int` representing the threshold for number of occurrences before removal
* **Restrictions**
    * No use of any built-in data structures, (`Collection`, `List`, `Map`)
    * Method operations should be idempotent.

## Example
* Given an array of `Integer` objects named `intArray` and an `Integer` named `numberOfDuplications`

```
// : Given
Integer[] input = new Integer[]{1,1,1,23,23,56,57,58};
Integer[] expected = new Integer[]{23,23,56,57,58};
DuplicateDeleter deleter = new DuplicateDeleter(intArray);

// : When
Integer[] actual = deleter.removeDuplicates(3);

// : Then
Assert.assertEquals(expected, actual);
```
