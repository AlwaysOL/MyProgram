LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := hello_jni

LOCAL_SRC_FILES := NativeCpp.cpp
LOCAL_SRC_FILES := hello_jni.cpp

include $(BUILD_SHARED_LIBRARY)