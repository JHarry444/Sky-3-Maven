package com.qa;

import com.qa.peer.Doggo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {


    @Test
    void testTh() {
        Assertions.assertEquals("27th", Doggo.compete(1).get(25));
    }
    @Test
    void testSt() {
        Assertions.assertEquals("51st", Doggo.compete(1).get(49));

    }
    @Test
    void testNd() {
        Assertions.assertEquals("42nd", Doggo.compete(1).get(40));

    }
    @Test
    void testRd() {
        Assertions.assertEquals("73rd", Doggo.compete(1).get(71));

    }

    @Test
    void testSize() {
        Assertions.assertEquals(99, Doggo.compete(1).size());
    }


    @Test
    void test11() {
        Assertions.assertEquals("11th", Doggo.compete(1).get(9));
    }

    @Test
    void test12() {
        Assertions.assertEquals("12th", Doggo.compete(1).get(10));
    }

    @Test
    void test13() {
        Assertions.assertEquals("13th", Doggo.compete(1).get(11));
    }

    @Test
    void testDoesNotContain() {
        Assertions.assertFalse(Doggo.compete(73).contains("73rd"));
    }

    @Test
    void testNotNull() {
        Assertions.assertNotNull(Doggo.compete(1));
    }
}
