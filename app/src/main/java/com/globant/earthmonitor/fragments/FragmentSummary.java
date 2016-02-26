package com.globant.earthmonitor.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.adapter.RecyclerSummaryAdapter;
import com.globant.earthmonitor.interfaces.Callback;
import com.globant.earthmonitor.interactor.Interactor;
import com.globant.earthmonitor.model.GeoJson;
import com.globant.earthmonitor.utils.Constants;
import com.google.gson.Gson;

/**
 * Created by zadtankus on 16/02/16.
 */
public class FragmentSummary  extends BaseFragment implements Callback{
    private static final String TAG = FragmentSummary.class.getSimpleName();

    private RecyclerView mRecycler;
    private Interactor mInteractor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View summaryView = inflater.inflate(R.layout.fragment_summary,container,false);

        Log.d(TAG, "EXECUTE ONCREATE VIEW");

        mInteractor = new Interactor(this);
        mInteractor.getEarthQuakeSummary();

        mRecycler = (RecyclerView)summaryView.findViewById(R.id.recyclerSummary);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        mRecycler.setLayoutManager(llm);
        /*mRecycler.setAdapter(new RecyclerSummaryAdapter(
                new Gson().fromJson(Constants.TEST_STRING,GeoJson.class).getFeatures(),
                getActivity()));*/

        //forceCrash();
        return summaryView;
    }

    @Override
    public void onError(String message) {
        Log.e(TAG, "THIS SHIT EXPLODE MEN :O "+message);
    }

    @Override
    public void onSuccess(Object param) {
        GeoJson stuff = (GeoJson)param;
        mRecycler.setAdapter(new RecyclerSummaryAdapter(stuff.getFeatures(),getActivity()));
    }

    public void forceCrash() {
        throw new RuntimeException("This is a crash");
    }

}
