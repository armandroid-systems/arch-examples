package com.globant.earthmonitor.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.interfaces.IOnClickElement;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.utils.SummaryVh;

import java.util.List;

/**
 * Created by zadtankus on 11/02/16.
 */
public class SummaryRecyclerAdapter extends RecyclerView.Adapter<SummaryVh>{
    private static final String TAG = SummaryRecyclerAdapter.class.getSimpleName();

    private List<Feature> features;
    private IOnClickElement clickElement;

    public SummaryRecyclerAdapter(List<Feature> features, IOnClickElement paramElement) {
        this.features = features;
        this.clickElement = paramElement;
    }

    @Override
    public SummaryVh onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_summary_item,parent,false);
        return new SummaryVh(itemView,clickElement);
    }

    @Override
    public void onBindViewHolder(SummaryVh holder, int position) {
        holder.date.setText(features.get(position).getProperties().getTitle());
        holder.place.setText(features.get(position).getProperties().getPlace());
        holder.magnitude.setText(""+features.get(position).getProperties().getMag());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        if(features != null){
            return features.size();
        }else{
            return 0;
        }
    }
}
