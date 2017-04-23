package com.example.shopping.bean;

/**
 * Created by 邹家豪 on 2016/9/29.
 */
public class Tab {
    private int title;
    private int icon;
    private Class fragment;

    public Tab(int title, int icon, Class fragment) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public int getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }
}
