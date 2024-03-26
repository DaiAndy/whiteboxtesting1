package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class charCounterTest {

    // 100% Node Coverage Test
    @Test
    public void emptyArr() {
        char[] array = {};
        assertEquals(0, charCounter.count(array, 'a'));
    }

    // 100% Edge Coverage Test
    @Test
    public void testOneElementCountOne() {
        char[] array = {'a'};
        assertEquals(1, charCounter.count(array, 'a'));
    }

    // 100% Edge-Pair Coverage Test
    @Test
    public void testTwoElementCountOne() {
        char[] array = {'a', 'b'};
        assertEquals(1, charCounter.count(array, 'a'));
    }
}
