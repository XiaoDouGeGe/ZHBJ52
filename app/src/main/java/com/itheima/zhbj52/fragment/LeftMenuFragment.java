package com.itheima.zhbj52.fragment;

import android.view.View;

import com.itheima.zhbj52.R;

/**
 * 侧边栏
 */
public class LeftMenuFragment extends BaseFragment {

    @Override
    public View initViews() {
        View view = View.inflate(mActivity, R.layout.fragment_left_menu, null);
        return view;
    }

}
