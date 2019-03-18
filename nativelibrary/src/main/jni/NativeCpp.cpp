//
// Created by yanjia on 2019/1/18.
//

#include <jni.h>

extern "C"
{

    JNIEXPORT jstring JNICALL Java_com_yanjia_nativelibrary_HelloCpp_getAA(JNIEnv *env, jobject obj ){
       // 参数说明
       // 1. JNIEnv：代表了VM里面的环境，本地的代码可以通过该参数与Java代码进行操作
       // 2. obj：定义JNI方法的类的一个本地引用（this）
    return env -> NewStringUTF("Hello i am from JNI44!");
    // 上述代码是返回一个String类型的"Hello i am from JNI!"字符串
    }
}