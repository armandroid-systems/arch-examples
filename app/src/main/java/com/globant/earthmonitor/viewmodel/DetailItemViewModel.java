package com.globant.earthmonitor.viewmodel;

import android.databinding.BaseObservable;

import com.globant.earthmonitor.model.Feature;

/**
 * Created by zadtankus on 23/02/16.
 */
public class DetailItemViewModel extends BaseObservable {
    private static final String TAG = DetailItemViewModel.class.getSimpleName();

    private Feature theFeature;

    public DetailItemViewModel(Feature theFeature) {
        this.theFeature = theFeature;
    }

    public String getPlaceEvent(){
        return theFeature.getProperties().getPlace();
    }

    public String getMagEvent(){
        return String.valueOf(theFeature.getProperties().getMag());
    }

    public String getCoordinates(){
        return theFeature.getGeometry().getCoordinates().get(0)+","+theFeature.getGeometry().getCoordinates().get(1);
    }
}
