package com.wuyexiong.wechatlikebottomtabui.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.wuyexiong.wechatlikebottomtabui.fragments.ChatFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.ContactFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.DiscoverFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.MeFragment;

/**
 * Created by wuyexiong on 4/25/15.
 */
public class BottomTabFragmentAdapter extends FragmentPagerAdapter {

    private final String LOG_TAG = BottomTabFragmentAdapter.class.getSimpleName();
    private final int CHAT = 0;
    private final int CONTACT = 1;
    private final int DISCOVER = 2;
    private final int ME = 3;

    protected static final String[] CONTENT = new String[] { "This", "Is", "A", "Test", };
    private int mCount = CONTENT.length;

    public BottomTabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case CHAT:
                return ChatFragment.newInstance();
            case CONTACT:
                return ContactFragment.newInstance();
            case DISCOVER:
                return DiscoverFragment.newInstance();
            case ME:
                return MeFragment.newInstance();
            default:
                Log.e(LOG_TAG, "Selected not validate bottom tab");
        }
        return ChatFragment.newInstance();
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
