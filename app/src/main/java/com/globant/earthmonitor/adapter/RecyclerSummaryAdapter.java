package com.globant.earthmonitor.adapter;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.globant.earthmonitor.BR;
import com.globant.earthmonitor.R;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.utils.SummaryHolder;
import com.globant.earthmonitor.viewmodel.SummaryViewModel;

import java.util.List;

/**
 * Created by zadtankus on 15/02/16.
 */
public class RecyclerSummaryAdapter  extends RecyclerView.Adapter<SummaryHolder> {
    private static final String TAG = RecyclerSummaryAdapter.class.getSimpleName();

    private List<Feature> data;
    private Activity mActivity;

    public RecyclerSummaryAdapter(List<Feature> data, Activity activity) {
        this.mActivity = activity;
        this.data = data;
    }

    @Override
    public SummaryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewDataBinding holderElement = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.recycler_summary_item,parent,false);

        return new SummaryHolder(holderElement);
    }

    @Override
    public void onBindViewHolder(SummaryHolder holder, int position) {
        holder.getViewDataBinding().setVariable(BR.feature,new SummaryViewModel(mActivity,data.get(position)));
    }

    @Override
    public int getItemCount() {
        return null!= data ? data.size() : 0;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
