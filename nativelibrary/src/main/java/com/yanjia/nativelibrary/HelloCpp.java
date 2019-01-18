package com.yanjia.nativelibrary;

/**
 * @User Created by yanjia on 2019/1/18.
 * @Description
 */
public class HelloCpp {
    static {
        System.loadLibrary("nativelibrary");
    }

    public static native String getAA();

}
