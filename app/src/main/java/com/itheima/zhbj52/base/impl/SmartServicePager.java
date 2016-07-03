package com.itheima.zhbj52.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.itheima.zhbj52.base.BasePager;

/**
 * 实现智慧服务
 *
 * Created by DOU on 2016/7/3.
 */
public class SmartServicePager extends BasePager  {

    public SmartServicePager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        tvTitle.setText("智慧服务");

        TextView text = new TextView(mActivity);
        text.setText("智慧服务");
        text.setTextColor(Color.RED);
        text.setTextSize(30);
        text.setGravity(Gravity.CENTER);
        //向FrameLayout中动态添加布局
        fflContent.addView(text);
    }
}
