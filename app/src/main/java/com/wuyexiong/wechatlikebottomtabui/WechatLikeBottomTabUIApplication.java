package com.wuyexiong.wechatlikebottomtabui;

import android.app.Application;
import android.content.Context;

import java.util.Locale;

/**
 * Created by Easydinner on 06/06/15.
 */
public class WechatLikeBottomTabUIApplication extends Application {


    private static Context context;

    //private static ApplicationController controller;

    private static Locale localeConfiguration;
    public static Context getContext() {
        return context;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }


}
