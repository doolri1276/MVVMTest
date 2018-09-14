package com.snownaul.mvvmtest;

import android.content.Context;
import android.view.View;

import androidx.databinding.ObservableField;

public class ViewModel_MainActivity implements BaseViewModel {

    public final ObservableField<String> helloText = new ObservableField<>();
    public Context context;

    public ViewModel_MainActivity(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate() {
        helloText.set("hello!!");
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    public void showCurrentTime(){
        helloText.set(String.valueOf(System.currentTimeMillis()));
    }

    public View.OnClickListener currentTime2ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showCurrentTime();
        }
    };

    public void clickGoToInputActivity(){
        MoveActivity.goToInputActivity();
    }

    public void clickGoToListActivity(){
        MoveActivity.goToListActivity();
    }

    public void clickGoToRecyclerActivity(){
        MoveActivity.goToRecyclerActivity();
    }
}
