package com.snownaul.mvvmtest.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.snownaul.mvvmtest.R;
import com.snownaul.mvvmtest.databinding.ActivityRecyclerBinding;
import com.snownaul.mvvmtest.list_view.UserViewModel;
import com.snownaul.mvvmtest.list_view.UsersViewModel;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    ActivityRecyclerBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler);
        binding.setModel(new UsersViewModel());


    }

    @BindingAdapter("app:items")
    public static void setUserList(RecyclerView recyclerView, ArrayList<UserViewModel> users){
        UserRecyclerViewAdapter adapter;

        if(recyclerView.getAdapter()==null){
            adapter=new UserRecyclerViewAdapter();
            recyclerView.setAdapter(adapter);
        }else{
            adapter=(UserRecyclerViewAdapter) recyclerView.getAdapter();
        }

        adapter.add(users);
    }
}
