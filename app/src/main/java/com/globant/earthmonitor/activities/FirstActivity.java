package com.globant.earthmonitor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.fragment.FragmentSummary;
import com.globant.earthmonitor.utils.Constants;
import com.globant.earthmonitor.utils.ScreenManager;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = FirstActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        if(findViewById(R.id.viewWrapper) != null){
            if(savedInstanceState == null){
                try {
                    ScreenManager.screenChange(FirstActivity.this,R.id.viewWrapper,
                            FragmentSummary.class,null,Constants.VIEW_LIST, Constants.BIN_TRUE);
                } catch (IllegalAccessException e) {
                    Log.e(TAG,"ERROR "+e.getMessage());
                } catch (InstantiationException e) {
                    Log.e(TAG, "ERROR " + e.getMessage());
                }
            }

        }


    }
}
