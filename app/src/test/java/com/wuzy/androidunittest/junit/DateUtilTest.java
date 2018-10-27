package com.wuzy.androidunittest.junit;

import com.wuzy.androidunittest.util.DateUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

/**
 * Created by wuzy on 2018/10/24.
 */

public class DateUtilTest {

    private String time = "2018-10-24 16:18:28";

    private long timeStamp = 1540369108000L;

    // 添加自定义 Rule
    @Rule
    public MyRule myRule = new MyRule();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void dateToStamp() throws Exception {
        Assert.assertEquals(timeStamp, DateUtil.dateToStamp(time));
    }

    @Test(expected = ParseException.class)
    public void dateToStamp1() throws Exception {
        DateUtil.dateToStamp("2017-11-01");
    }

    @Test(timeout = 100)
    public void dateToStamp2() throws Exception {
        DateUtil.dateToStamp(time);
    }

    @Test
    public void stampToDate() throws Exception {
        assertEquals(time, DateUtil.stampToDate(timeStamp));
    }

}