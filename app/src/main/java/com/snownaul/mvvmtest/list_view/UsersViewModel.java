package com.snownaul.mvvmtest.list_view;

import com.snownaul.mvvmtest.BaseViewModel;

import java.util.Random;

import androidx.databinding.ObservableArrayList;

public class UsersViewModel implements BaseViewModel {

    public final ObservableArrayList<UserViewModel> users = new ObservableArrayList<>();


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

    public void newUser(){
        users.add(new UserViewModel("name "+random(),"email "+random()));
    }

    private int random(){
        return new Random().nextInt();
    }
}
