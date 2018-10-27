package com.wuzy.androidunittest.junit;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * Created by wuzy on 2018/10/26.
 * 自定义匹配器，判断数字是否在范围内
 */

public class IsNumberRangeMatcher extends BaseMatcher<Integer> {

    private int start;

    private int end;

    public IsNumberRangeMatcher(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean matches(Object item) {
        if (item == null) {
            return false;
        }
        Integer i = (Integer) item;
        return start <= i && i <= end;
    }

    @Override
    public void describeTo(Description description) {

    }

    @Override
    public void describeMismatch(Object item, Description description) {
        super.describeMismatch(item, description);
    }
}
