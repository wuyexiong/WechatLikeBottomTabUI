package com.wuyexiong.wechatlikebottomtabui.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wuyexiong.wechatlikebottomtabui.TestFragment;

/**
 * Created by wuyexiong on 4/25/15.
 */
public class BottomTabFragmentAdapter extends FragmentPagerAdapter {

    private final int CHAT = 1;
    private final int CONTACT = 2;
    private final int DISCOVER = 3;
    private final int ME = 4;

    protected static final String[] CONTENT = new String[] { "This", "Is", "A", "Test", };
    private int mCount = CONTENT.length;

    public BottomTabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case CHAT:

        }
        return TestFragment.newInstance(CONTENT[position % CONTENT.length]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return BottomTabFragmentAdapter.CONTENT[position % CONTENT.length];
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}
