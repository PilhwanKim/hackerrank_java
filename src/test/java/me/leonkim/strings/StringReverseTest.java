package me.leonkim.strings;

import junit.framework.TestCase;
import org.junit.Test;

public class StringReverseTest extends TestCase {

    @Test
    public void test01() {
        String result = StringReverse.solution("madam");
        assertEquals(result, "Yes");
    }

    @Test
    public void test02() {
        String result = StringReverse.solution("java");
        assertEquals(result, "No");
    }

}