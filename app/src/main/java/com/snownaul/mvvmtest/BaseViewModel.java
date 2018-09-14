package com.snownaul.mvvmtest;

import android.content.Context;

public interface BaseViewModel {

    void onCreate();

    void onResume();

    void onPause();

    void onDestroy();
}
