package me.leonkim.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void test01() {
        int[] array = {3, 2, 1};
        int[] results = BubbleSort._countSwaps(array);
        assertArrayEquals(results, new int[] {3, 1, 3});
    }

}