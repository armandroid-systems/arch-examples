package com.globant.earthmonitor.utils;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by zadtankus on 16/02/16.
 */
public class SummaryHolder extends RecyclerView.ViewHolder{

    private ViewDataBinding viewDataBinding;

    public SummaryHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
        this.viewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }
}
