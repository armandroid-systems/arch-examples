package com.globant.earthmonitor.network;

import com.globant.earthmonitor.model.GeoJson;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zadtankus on 10/02/16.
 */
public interface EarthquakeService {
    @GET("summary/all_hour.geojson")
    Call<GeoJson> getAllHourSummary();
}
