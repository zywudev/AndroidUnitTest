package com.wuzy.androidunittest.junit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by wuzy on 2018/10/26.
 */

public class AssertThatTest {

    @Test
    public void testAssertThat() {
        assertThat(6, is(6));
    }

    @Test
    public void testAssertThat1() {
        assertThat(2,new IsNumberRangeMatcher(1,3));
    }
}
