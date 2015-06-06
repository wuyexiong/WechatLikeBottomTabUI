package com.wuyexiong.wechatlikebottomtabui.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.wuyexiong.wechatlikebottomtabui.MainActivity;
import com.wuyexiong.wechatlikebottomtabui.R;
import com.wuyexiong.wechatlikebottomtabui.WechatLikeBottomTabUIApplication;
import com.wuyexiong.wechatlikebottomtabui.fragments.ChatsFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.ContactFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.DiscoverFragment;
import com.wuyexiong.wechatlikebottomtabui.fragments.MeFragment;

/**
 * Created by wuyexiong on 4/25/15.
 */
public class BottomTabFragmentAdapter extends FragmentPagerAdapter {

    private final String LOG_TAG = BottomTabFragmentAdapter.class.getSimpleName();
    private MainActivity mainActivity;

    private final int CHATS = 0;
    private final int CONTACTS = 1;
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
            case CHATS:
                return ChatsFragment.newInstance();
            case CONTACTS:
                return ContactFragment.newInstance();
            case DISCOVER:
                return DiscoverFragment.newInstance();
            case ME:
                return MeFragment.newInstance();
            default:
                Log.e(LOG_TAG, "Selected not validate bottom tab");
        }
        return ChatsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case CHATS:
                return WechatLikeBottomTabUIApplication.getContext().getString(R.string.chats);
            case CONTACTS:
                return WechatLikeBottomTabUIApplication.getContext().getString(R.string.contacts);
            case DISCOVER:
                return WechatLikeBottomTabUIApplication.getContext().getString(R.string.discover);
            case ME:
                return WechatLikeBottomTabUIApplication.getContext().getString(R.string.me);
            default:
                Log.e(LOG_TAG, "Selected not validate bottom tab");
        }
        return "Title";
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}
