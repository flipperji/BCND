package com.flippey.bcnd;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

/**
 * Created by flippey on 2018/2/2 16:14.
 */

public class BcdnApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this,"http://47.52.207.212:9090");
    }
}
