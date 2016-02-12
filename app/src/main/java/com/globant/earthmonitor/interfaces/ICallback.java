package com.globant.earthmonitor.interfaces;

/**
 * Created by zadtankus on 10/02/16.
 */
public interface ICallback {
    void onSuccess(Object param);
    void onError(String message);
}
