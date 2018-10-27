package com.wuzy.androidunittest.junit;

import com.wuzy.androidunittest.util.DateUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by wuzy on 2018/10/26.
 * 参数化测试
 */
@RunWith(Parameterized.class)
public class DateFormatTest {

    private String time;

    public DateFormatTest(String time) {
        this.time = time;
    }

    // 静态方法
    @Parameterized.Parameters
    public static Collection primeNumber() {
        return Arrays.asList("2018-10-24", "2018-10-24 16:18:28","2018年10月24日 16点18分28秒");
    }

    @Test(expected = ParseException.class)
    public void dateToStamp() throws ParseException {
        DateUtil.dateToStamp(time);
    }
}
