package com.example.myapplication.lanchat.Util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.example.myapplication.BuildConfig;

import io.noties.debug.AndroidLogDebugOutput;
import io.noties.debug.Debug;

/**
 * 全局获取上下文context(包含一些全局变量)
 */
public class App extends Application {
    
    @SuppressLint("StaticFieldLeak")
    //上下文
    private static Context sContext;

    //我的IP
    private static String sMyIP;

    //头像ID
    private static int imageId;

    //对方头像
    private static int otherImageId;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        //Debug初始化
        Debug.init(new AndroidLogDebugOutput(BuildConfig.DEBUG));
    }

    /**
     * getContxet
     * @return
     */
    public static Context getContxet() {
        return sContext;
    }

    /**
     * setContxet
     * @param sContxet
     */
    public static void setContxet(Context sContxet) {
        App.sContext = sContxet;
    }

    /**
     * getsMyIP
     * @return
     */
    public static String getsMyIP() {
        return sMyIP;
    }

    /**
     * setMyIP
     * @param sMyIP
     */
    public static void setsMyIP(String sMyIP) {
        App.sMyIP = sMyIP;
    }

    /**
     * getImageId
     * @return
     */
    public static int getImageId() {
        return imageId;
    }

    /**
     * setImageId
     * @param imageId
     */
    public static void setImageId(int imageId) {
        App.imageId = imageId;
    }

    /**
     * getOtherImageId
     * @return
     */
    public static int getOtherImageId() {
        return otherImageId;
    }

    /**
     * setOtherImageId
     * @param otherImageId
     */
    public static void setOtherImageId(int otherImageId) {
        App.otherImageId = otherImageId;
    }
}
