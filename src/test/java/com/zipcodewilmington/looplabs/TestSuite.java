package com.zipcodewilmington.looplabs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 1/28/18.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArrayUtilsTest.class,
        IntegerDuplicateDeleterTest.class,
        StringDuplicateDeleterTest.class
})
public class TestSuite {
}