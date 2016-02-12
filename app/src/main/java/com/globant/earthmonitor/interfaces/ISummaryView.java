package com.globant.earthmonitor.interfaces;

import com.globant.earthmonitor.adapters.SummaryRecyclerAdapter;
import com.globant.earthmonitor.model.Feature;

import java.util.List;

/**
 * Created by zadtankus on 10/02/16.
 */
public interface ISummaryView {
    void goToDetail(Feature param);
    void showStatusMessage(String message);
    SummaryRecyclerAdapter getSummaryAdapter(List<Feature> features);
    void createRecyclerSummary(SummaryRecyclerAdapter mAdapter);

}
