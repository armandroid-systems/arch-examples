package com.globant.earthmonitor.presenter;

import android.util.Log;

import com.globant.earthmonitor.interactor.Interactor;
import com.globant.earthmonitor.interfaces.ICallback;
import com.globant.earthmonitor.interfaces.IListPresenter;
import com.globant.earthmonitor.interfaces.ISummaryView;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.model.GeoJson;

import java.util.List;

/**
 * Created by zadtankus on 10/02/16.
 */
public class ListPresenter implements IListPresenter, ICallback{
    private static final String TAG = ListPresenter.class.getSimpleName();

    private Interactor mInteractor;
    private ISummaryView summaryView;
    private List<Feature> features;

    public ListPresenter(Interactor mInteractor, ISummaryView summaryView) {
        this.mInteractor = mInteractor;
        this.summaryView = summaryView;
    }

    @Override
    public void clickElement(int id) {
        summaryView.goToDetail(features.get(id));
    }

    @Override
    public void getSummary() {
        Log.d(TAG,"SUMMAR_Y");
        mInteractor.getEarthQuakeSummary(this);
    }

    @Override
    public void onSuccess(Object param) {
        Log.d(TAG,"SUMMAR_Y SUCCESS");
        features = ((GeoJson)param).getFeatures();
        summaryView.createRecyclerSummary(summaryView.getSummaryAdapter(features));
    }

    @Override
    public void onError(String message) {
        summaryView.showStatusMessage(message);
    }

}
