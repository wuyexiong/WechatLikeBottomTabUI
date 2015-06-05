package com.wuyexiong.wechatlikebottomtabui.fragments.supports;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wuyexiong.wechatlikebottomtabui.MainBottomTabLayout;
import com.wuyexiong.wechatlikebottomtabui.R;
import com.wuyexiong.wechatlikebottomtabui.Adapters.BottomTabFragmentAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private BottomTabFragmentAdapter mAdapter;
    private ViewPager mPager;
    private MainBottomTabLayout mTabLayout;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_place_holder, container, false);
        setupViews(rootView);
        return rootView;
    }

    private void setupViews(View view) {
        mAdapter = new BottomTabFragmentAdapter(getFragmentManager());
        mPager = (ViewPager) view.findViewById(R.id.bottom_tab_pager);
        mPager.setAdapter(mAdapter);
        mTabLayout = (MainBottomTabLayout) view.findViewById(R.id.main_bottom_tab_layout);
        mTabLayout.setViewPager(mPager);
    }
}