package com.itheima.zhbj52.base;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.itheima.zhbj52.R;

/**
 * 主页下5个子页面的基类
 *
 * Created by DOU on 2016/7/3.
 */

public class BasePager {
    public Activity mActivity;
    public View mRootView; //布局对象

    public TextView tvTitle;//标题对象
    public FrameLayout fflContent;//内容对象

    public BasePager(Activity activity){
        mActivity = activity;

        initViews();
    }

    /**
     * 初始化布局
     */
    public void initViews(){
        mRootView = View.inflate(mActivity, R.layout.base_pager, null);

        tvTitle = (TextView) mRootView.findViewById(R.id.tv_title);
        fflContent= (FrameLayout) mRootView.findViewById(R.id.ffl_content);

    }

    /**
     * 初始化数据
     */
    public void initData(){

    }
}
