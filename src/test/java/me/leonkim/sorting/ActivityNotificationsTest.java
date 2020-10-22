package me.leonkim.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActivityNotificationsTest {

    @Test
    public void test01() {
        int[] array = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int result = ActivityNotifications.activityNotifications(array, 5);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void test02() {
        int[] array = {1, 2, 3, 4, 4};
        int result = ActivityNotifications.activityNotifications(array, 4);
        Assert.assertEquals(result, 0);
    }

}