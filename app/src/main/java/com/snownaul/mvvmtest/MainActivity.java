package com.snownaul.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.snownaul.mvvmtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new ViewModel_MainActivity(this));
        binding.getViewModel().onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.getViewModel().onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        binding.getViewModel().onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.getViewModel().onDestroy();
    }
}
