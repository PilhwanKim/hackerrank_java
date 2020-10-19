package me.leonkim.dp;

import junit.framework.TestCase;
import org.junit.Test;

public class MaxArraySumTest extends TestCase {

    @Test
    public void test01() {
        int[] array = {3, 7, 4, 6, 5};
        assertEquals(MaxArraySum.maxSubsetSum(array), 13);
    }

    @Test
    public void test02() {
        int[] array = {2, 1, 5, 8, 4};
        assertEquals(MaxArraySum.maxSubsetSum(array), 11);
    }

    @Test
    public void test03() {
        int[] array = {3, 5, -7, 8, 10};
        assertEquals(MaxArraySum.maxSubsetSum(array), 15);
    }

}