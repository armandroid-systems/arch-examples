package com.globant.earthmonitor.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zadtankus on 10/02/16.
 */
public class EarthquakeApi {

    private static final String TAG = EarthquakeApi.class.getSimpleName();
    public static final String API_ENDPOINT = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/";

    private final EarthquakeService mServices;

    private EarthquakeService init(){
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(EarthquakeService.class);
    }

    public EarthquakeApi() {
        this.mServices = init();
    }

    public EarthquakeService getService(){
        return mServices;
    }
}
