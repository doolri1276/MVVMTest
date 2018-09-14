package com.snownaul.mvvmtest.recycler_view;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private final T binding;

    public BindingViewHolder(@NonNull View itemView) {
        super(itemView);
        this.binding=(T)DataBindingUtil.bind(itemView);
    }

    public T binding(){
        return binding;
    }
}
