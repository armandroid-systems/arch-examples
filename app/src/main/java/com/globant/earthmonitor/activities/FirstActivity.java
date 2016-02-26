package com.globant.earthmonitor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.crashlytics.android.Crashlytics;
import com.globant.earthmonitor.R;
import com.globant.earthmonitor.fragments.FragmentSummary;
import com.globant.earthmonitor.utils.Constants;
import com.globant.earthmonitor.utils.ScreenManager;
import io.fabric.sdk.android.Fabric;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = FirstActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_first);

        if(findViewById(R.id.fragmentWrapper) != null){
            if(savedInstanceState == null){
                try {
                    ScreenManager.screenChange(FirstActivity.this,R.id.fragmentWrapper,
                            FragmentSummary.class,null, Constants.VIEW_SUMMARY,Constants.BIN_TRUE);
                } catch (IllegalAccessException e) {
                    Log.e(TAG,e.getMessage());
                } catch (InstantiationException ex) {
                    Log.e(TAG, ex.getMessage());
                }
            }
        }

    }
}
