package com.snownaul.mvvmtest.list_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.snownaul.mvvmtest.App;
import com.snownaul.mvvmtest.R;
import com.snownaul.mvvmtest.databinding.ListItemUserBinding;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;

public class UserListViewAdapter extends BaseAdapter {
    private ObservableArrayList<UserViewModel> users = new ObservableArrayList<>();

    public void addAll(ObservableArrayList<UserViewModel> users){
        this.users=users;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListItemUserBinding binding;

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(App.getInstance());
            binding = DataBindingUtil.inflate(inflater, R.layout.list_item_user, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        }else{
            binding = (ListItemUserBinding) convertView.getTag();
        }

        binding.setUser(users.get(position));

        return convertView;
    }
}
