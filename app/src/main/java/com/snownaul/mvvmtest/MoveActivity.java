package com.snownaul.mvvmtest;

import android.content.Intent;

import com.snownaul.mvvmtest.list_view.ListActivity;
import com.snownaul.mvvmtest.practice_recycler_view.PracticeRecyclerActivity;
import com.snownaul.mvvmtest.recycler_view.RecyclerActivity;

import androidx.core.content.ContextCompat;

public class MoveActivity {

    public static void goToInputActivity(){
        Intent intent = new Intent(App.getInstance(), InputActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToListActivity(){
        Intent intent = new Intent(App.getInstance(), ListActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToRecyclerActivity(){
        Intent intent = new Intent(App.getInstance(), RecyclerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToPracticeRecyclerActivity(){
        Intent intent = new Intent(App.getInstance(), PracticeRecyclerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }
}
