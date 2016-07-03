package com.itheima.zhbj52.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences的封装
 *
 * Created by DOU on 2016/6/30.
 */
public class PrefUtils {
    public static final String PREF_NAME = "config";

    public static boolean getBoolean(Context ctx,String key,boolean defaultValue){
        //判断之前有没有显示过新手引导页
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key,defaultValue);
    }

    public static void setBoolean(Context ctx,String key,boolean value){
        //判断之前有没有显示过新手引导页
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }
}
