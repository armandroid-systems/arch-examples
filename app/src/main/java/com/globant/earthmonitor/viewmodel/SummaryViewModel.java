package com.globant.earthmonitor.viewmodel;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.fragments.FragmentItemDetail;
import com.globant.earthmonitor.model.Feature;
import com.globant.earthmonitor.utils.Constants;
import com.globant.earthmonitor.utils.ScreenManager;

/**
 * Created by zadtankus on 20/02/16.
 */
public class SummaryViewModel extends BaseObservable{
    private static final String TAG = SummaryViewModel.class.getSimpleName();

    private Feature mFeature;
    private Activity mActivity;

    public SummaryViewModel(Activity mActivity, Feature mFeature) {
        this.mActivity = mActivity;
        this.mFeature = mFeature;
    }

    public String title(){
        return mFeature.getProperties().getTitle();
    }
    public String place(){
        return mFeature.getProperties().getPlace();
    }
    public String mag(){
        return ""+mFeature.getProperties().getMag();
    }

    public View.OnClickListener onClickDetected(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.textViewMore:
                        //goToDetailScreen();
                        Log.d(TAG,"CLICK :O ");
                        break;
                    default:
                        break;
                }
            }
        };
    }

    public void goToDetailScreen(){
        try {
            ScreenManager.screenChange((FragmentActivity)mActivity,R.id.fragmentWrapper,
                    FragmentItemDetail.class,null, Constants.VIEW_DETAIL,Constants.BIN_FALSE);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
