package com.aadebuger.androidonline;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.aadebuger.androidonline.mytestgradleTest \
 * com.aadebuger.androidonline.tests/android.test.InstrumentationTestRunner
 */
public class mytestgradleTest extends ActivityInstrumentationTestCase2<mytestgradle> {

    public mytestgradleTest() {
        super("com.aadebuger.androidonline", mytestgradle.class);
    }

}
