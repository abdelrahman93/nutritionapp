package com.task.nutritionapp.network;

import android.content.Context;

import java.io.InputStream;

import retrofit2.Retrofit;


/***
 * BaseServices this class act with the factory design pattern
 * it take a parameters and depend on them it decide to create retrofit using  httpRetrofit or HttpsRetrofit
 */
public abstract class BaseServices {
    protected Retrofit retrofit;

    protected void createRetrofit( String baseUrl) {
        retrofit = new HttpRetrofit().getRetrofit(baseUrl);

    }

    /***
     *
     * @return the Retrofit object which created above
     */
    public Retrofit getRetrofit() {
        return retrofit;
    }

}
