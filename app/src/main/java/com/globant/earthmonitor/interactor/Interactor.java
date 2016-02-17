package com.globant.earthmonitor.interactor;

import com.globant.earthmonitor.interaces.Callback;
import com.globant.earthmonitor.interaces.IInteractor;
import com.globant.earthmonitor.model.GeoJson;
import com.globant.earthmonitor.network.EarthquakeApi;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by zadtankus on 16/02/16.
 */
public class Interactor implements IInteractor {
    private static final String TAG = Interactor.class.getSimpleName();

    private EarthquakeApi dataApi;
    private Callback mCallback;

    public Interactor(Callback mCallback) {
        this.mCallback = mCallback;
        this.dataApi = new EarthquakeApi();
    }

    @Override
    public void getEarthQuakeSummary() {
        dataApi.getService().getAllHourSummary().enqueue(new retrofit2.Callback<GeoJson>() {
            @Override
            public void onResponse(Call<GeoJson> call, Response<GeoJson> response) {
                mCallback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<GeoJson> call, Throwable t) {
                mCallback.onError(t.getMessage());
            }
        });
    }
}
