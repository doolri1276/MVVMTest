package com.snownaul.mvvmtest.recycler_view;

import com.snownaul.mvvmtest.App;
import com.snownaul.mvvmtest.BaseViewModel;

import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.DividerItemDecoration;

public class DividerLineDecoratorViewModel implements BaseViewModel {

    public final ObservableArrayList<DividerItemDecoration> decorator = new ObservableArrayList<>();


    @Override
    public void onCreate() {
        //decorator.set(new DividerItemDecoration(App.getInstance(), DividerItemDecoration.VERTICAL));
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
