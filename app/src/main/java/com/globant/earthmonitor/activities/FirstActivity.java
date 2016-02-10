package com.globant.earthmonitor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.cocoahero.android.geojson.GeoJSON;
import com.globant.earthmonitor.R;
import com.globant.earthmonitor.model.GeoJson;
import com.globant.earthmonitor.network.EarthquakeApi;
import com.squareup.okhttp.ResponseBody;

import org.json.JSONException;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView mText = (TextView) findViewById(R.id.theLabel);

        EarthquakeApi api = new EarthquakeApi();
       api.getService().getAllHourSummary().enqueue(new Callback<GeoJson>() {
           @Override
           public void onResponse(Call<GeoJson> call, Response<GeoJson> response) {
               GeoJson theStuff = response.body();
               Log.d("XXX",theStuff.getType());
           }

           @Override
           public void onFailure(Call<GeoJson> call, Throwable t) {
                Log.e("XXX","ERRNO "+t.getMessage());
           }
       });
    }
}
