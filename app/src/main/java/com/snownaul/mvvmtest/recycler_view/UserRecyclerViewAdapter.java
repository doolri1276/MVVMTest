package com.snownaul.mvvmtest.recycler_view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.snownaul.mvvmtest.App;
import com.snownaul.mvvmtest.R;
import com.snownaul.mvvmtest.list_view.UserViewModel;
import com.snownaul.mvvmtest.databinding.ListItemUserBinding;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserRecyclerViewAdapter extends RecyclerView.Adapter<BindingViewHolder<ListItemUserBinding>> {
    private ArrayList<UserViewModel> users = new ArrayList<>();

    public void add(ArrayList<UserViewModel> users) {
        for (UserViewModel user : users) {
            if (!this.users.contains(user)) {
                this.users.add(user);
                notifyItemInserted(this.users.size() - 1);
            }
        }
    }

    @Override
    public BindingViewHolder<ListItemUserBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new BindingViewHolder<>(inflater.inflate(R.layout.list_item_user, parent, false));
    }

    @Override
    public void onBindViewHolder(BindingViewHolder<ListItemUserBinding> holder, int position) {
        holder.binding().setUser(users.get(position));
        //holder.binding().setNavigator(navigator);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
