package com.qa;

import com.qa.peer.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void testMinus1() {
        Assertions.assertEquals("NONE", Factorial.reverse(-1));

    }

    @Test
    void test0() {
        Assertions.assertEquals("NONE", Factorial.reverse(0));

    }

    @Test
    void test1() {
        Assertions.assertEquals("1!", Factorial.reverse(1));

    }

    @Test
    void test120() {
        Assertions.assertEquals("5!", Factorial.reverse(120));
    }


    @Test
    void test150() {
        Assertions.assertEquals("NONE", Factorial.reverse(150));
    }

    @Test
    void test3628800() {
        Assertions.assertEquals("10!", Factorial.reverse(3628800));
    }

    @Test
    void test479001600() {
        Assertions.assertEquals("12!", Factorial.reverse(479001600));
    }

    @Test
    void test6() {
        Assertions.assertEquals("3!", Factorial.reverse(6));
    }

    @Test
    void test18() {
        Assertions.assertEquals("NONE", Factorial.reverse(150));
    }
}
