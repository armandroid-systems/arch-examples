package com.globant.earthmonitor.interaces;

/**
 * Created by zadtankus on 16/02/16.
 */
public interface Callback {
    void onSuccess(Object param);
    void onError(String message);
}
