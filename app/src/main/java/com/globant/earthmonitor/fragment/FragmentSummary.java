package com.globant.earthmonitor.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.adapters.SummaryRecyclerAdapter;
import com.globant.earthmonitor.interactor.Interactor;
import com.globant.earthmonitor.interfaces.IOnClickElement;
import com.globant.earthmonitor.interfaces.ISummaryView;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.presenter.ListPresenter;
import com.globant.earthmonitor.utils.Constants;
import com.globant.earthmonitor.utils.ScreenManager;

import java.util.List;

/**
 * Created by zadtankus on 10/02/16.
 */
public class FragmentSummary extends BaseFragment implements ISummaryView, IOnClickElement {

    private RecyclerView mRecycler;
    private ListPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View summary = inflater.inflate(R.layout.fragment_summary,container, false);

        mPresenter = new ListPresenter(new Interactor(),this);

        mRecycler = (RecyclerView) summary.findViewById(R.id.recyclerSummary);

        mPresenter.getSummary();


        return summary;
    }

    @Override
    public void createRecyclerSummary(SummaryRecyclerAdapter mAdapter) {
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        mRecycler.setLayoutManager(llm);

        mRecycler.setAdapter(mAdapter);
    }

    @Override
    public SummaryRecyclerAdapter getSummaryAdapter(List<Feature> features) {
        return new SummaryRecyclerAdapter(features,this);
    }

    @Override
    public void showStatusMessage(String message) {

    }

    @Override
    public void goToDetail(Feature param) {
        try {
            ScreenManager.screenChange(getActivity(),R.id.viewWrapper,
                    FragmentDetail.class,null,Constants.VIEW_DETAIL, Constants.BIN_FALSE);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void performActionClick(int id) {
        mPresenter.clickElement(id);
    }
}
