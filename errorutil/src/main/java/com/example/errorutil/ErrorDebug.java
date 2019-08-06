package com.example.errorutil;

import android.util.Log;

public class ErrorDebug {

    private static final String TAG = "LIBRARY_TEST_ERROR";

    public static void e(String message) {
        Log.e(TAG, message);
    }

}
