package com.globant.earthmonitor.interactor;

import android.util.Log;

import com.globant.earthmonitor.interfaces.ICallback;
import com.globant.earthmonitor.interfaces.IInteractor;
import com.globant.earthmonitor.model.GeoJson;
import com.globant.earthmonitor.network.EarthquakeApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zadtankus on 10/02/16.
 */
public class Interactor implements IInteractor {
    private static final String TAG = Interactor.class.getSimpleName();

    private EarthquakeApi wsApi;

    public Interactor() {
        this.wsApi = new EarthquakeApi();
    }

    @Override
    public void getEarthQuakeSummary(final ICallback callback) {
        wsApi.getService().getAllHourSummary().enqueue(new Callback<GeoJson>() {
            @Override
            public void onResponse(Call<GeoJson> call, Response<GeoJson> response) {
                Log.d(TAG,"Interactor response 0k");
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<GeoJson> call, Throwable t) {
                callback.onError(t.getMessage());
                Log.e(TAG,"REST ERROR "+t.getMessage());
            }
        });
    }
}
