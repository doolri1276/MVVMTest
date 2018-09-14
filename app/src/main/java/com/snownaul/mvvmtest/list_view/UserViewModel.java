package com.snownaul.mvvmtest.list_view;

import com.snownaul.mvvmtest.BaseViewModel;

import androidx.databinding.ObservableField;

public class UserViewModel implements BaseViewModel {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> email = new ObservableField<>();

    public UserViewModel(String name, String email) {
        this.name.set(name);
        this.email.set(email);
    }

    @Override
    public void onCreate() {

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
}
