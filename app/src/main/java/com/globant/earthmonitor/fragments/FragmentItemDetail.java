package com.globant.earthmonitor.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.databinding.FragmentDetailItemBinding;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.viewmodel.DetailItemViewModel;

/**
 * Created by zadtankus on 20/02/16.
 */
public class FragmentItemDetail extends BaseFragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View detailView = inflater.inflate(R.layout.fragment_detail_item,container,false);

        FragmentDetailItemBinding mBinding = DataBindingUtil.bind(detailView);
        mBinding.setDetail(new DetailItemViewModel((Feature) mParam));
        return detailView;
    }
}
