package com.itheima.zhbj52.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.itheima.zhbj52.R;
import com.itheima.zhbj52.base.BasePager;
import com.itheima.zhbj52.base.impl.GovAffairPager;
import com.itheima.zhbj52.base.impl.HomePager;
import com.itheima.zhbj52.base.impl.NewsCenterPager;
import com.itheima.zhbj52.base.impl.SettingPager;
import com.itheima.zhbj52.base.impl.SmartServicePager;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.util.ArrayList;

/**
 * 主页内容
 */
public class ContentFragment extends BaseFragment {

    //注解方式
    @ViewInject(R.id.rg_group)
    private RadioGroup rgGroup;

    @ViewInject(R.id.vp_content)
    private ViewPager mViewPager;

    private ArrayList<BasePager> mPagerList;

    @Override
    public View initViews() {
        View view = View.inflate(mActivity, R.layout.fragment_content, null);

        //rgGroup = (RadioGroup) view.findViewById(R.id.rg_group);
        ViewUtils.inject(this, view);

        return view;
    }

    @Override
    public void initData() {

        rgGroup.check(R.id.rb_home);//默认勾选首页


        //初始化5个子页面
        mPagerList = new ArrayList<BasePager>();
//        for (int i=0; i<5; i++){
//            BasePager pager = new BasePager(mActivity);
//            mPagerList.add(pager);
//        }
        mPagerList.add(new HomePager(mActivity));
        mPagerList.add(new NewsCenterPager(mActivity));
        mPagerList.add(new SmartServicePager(mActivity));
        mPagerList.add(new GovAffairPager(mActivity));
        mPagerList.add(new SettingPager(mActivity));


        mViewPager.setAdapter(new ContentAdapter());

    }

    class ContentAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return mPagerList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BasePager pager = mPagerList.get(position);
            container.addView(pager.mRootView);
            pager.initData();//初始化数据...
            return pager.mRootView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
