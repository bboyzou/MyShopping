package com.example.shopping;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.shopping.bean.Tab;
import com.example.shopping.fragment.CartFragment;
import com.example.shopping.fragment.CatagoryFragment;
import com.example.shopping.fragment.HomeFragment;
import com.example.shopping.fragment.HotFragment;
import com.example.shopping.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FragmentTabHost mTabHost;
    private LayoutInflater inflater;

    private List<Tab> tabs = new ArrayList<Tab>(5);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        inflater= LayoutInflater.from(this);

        mTabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        Tab home = new Tab(R.string.home, R.drawable.selector_icon_home, HomeFragment.class);
        Tab hot = new Tab(R.string.hot, R.drawable.selector_icon_hot, HotFragment.class);
        Tab catagory = new Tab(R.string.catagory, R.drawable.selector_icon_catagory, CatagoryFragment.class);
        Tab cart = new Tab(R.string.cart, R.drawable.selector_icon_cart, CartFragment.class);
        Tab mine = new Tab(R.string.mine, R.drawable.selector_icon_mine, MineFragment.class);
        tabs.add(home);
        tabs.add(hot);
        tabs.add(catagory);
        tabs.add(cart);
        tabs.add(mine);

        for (Tab tab : tabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicater(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null);
        }
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setCurrentTab(0);
    }

    private View buildIndicater(Tab tab) {
        View view = inflater.inflate(R.layout.tab_indicater, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon_tab);
        imageView.setImageResource(tab.getIcon());
        TextView textView = (TextView) view.findViewById(R.id.txt_indicater);
        textView.setText(tab.getTitle());
        return view;
    }
}
