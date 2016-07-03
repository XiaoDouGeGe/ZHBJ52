package com.itheima.zhbj52.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.itheima.zhbj52.base.BasePager;

/**
 * 新闻中心首页
 *
 * Created by DOU on 2016/7/3.
 */
public class NewsCenterPager extends BasePager  {

    public NewsCenterPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        tvTitle.setText("新闻中心");

        TextView text = new TextView(mActivity);
        text.setText("新闻");
        text.setTextColor(Color.RED);
        text.setTextSize(30);
        text.setGravity(Gravity.CENTER);
        //向FrameLayout中动态添加布局
        flContent.addView(text);
    }
}
