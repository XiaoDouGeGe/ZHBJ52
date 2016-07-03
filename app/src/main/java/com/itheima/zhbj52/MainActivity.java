package com.itheima.zhbj52;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.itheima.zhbj52.fragment.ContentFragment;
import com.itheima.zhbj52.fragment.LeftMenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    private static final String FRAGMENT_LEFT_MENU = "fragment_left_menu";
    private static final String FRAGMENT_CONTENT = "fragment_content";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setBehindContentView(R.layout.left_menu);//设置侧边栏布局
        SlidingMenu slidingMenu = getSlidingMenu();//获得侧边栏对象
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//设置全屏触摸
//        slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);//设置展现模式
        slidingMenu.setBehindOffset(200);//设置预留屏幕的宽度

        initFragment();
    }


    /**
     *
     * 初始化fragment，将fragment填充给布局文件
     */
    private void initFragment(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction(); //开启事务

        transaction.replace(R.id.fl_left_menu, new LeftMenuFragment(), FRAGMENT_LEFT_MENU);//用fragment替换fragmentlayout
        transaction.replace(R.id.fl_content, new ContentFragment(), FRAGMENT_CONTENT);

//        fm.findFragmentByTag(FRAGMENT_LEFT_MENU);//通过 Tag 找到fragment

        transaction.commit();//提交事务
    }

}
