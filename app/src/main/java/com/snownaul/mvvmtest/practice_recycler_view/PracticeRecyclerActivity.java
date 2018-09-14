package com.snownaul.mvvmtest.practice_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.snownaul.mvvmtest.R;
import com.snownaul.mvvmtest.databinding.ActivityPracticeRecyclerBinding;

public class PracticeRecyclerActivity extends AppCompatActivity {

    ActivityPracticeRecyclerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this, R.layout.activity_practice_recycler);

    }
}
