package com.zipcodewilmington.looplabs;

import java.util.Random;

/**
 * Created by leon on 1/26/18.
 */
public final class RandomUtils {
    private static volatile Random random = new Random();

    private RandomUtils() {}

    public static synchronized Float createFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    public static Integer createInteger(int min, int max) {
        return createFloat(min, max).intValue();
    }

    public static Integer[] createIntegers(int min, int max, int length) {
        Integer[] intArray = new Integer[length];
        for(int i=0; i<length; i++) {
            intArray[i] = createInteger(min, max);
        }
        return intArray;
    }
}
