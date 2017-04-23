package com.example.shopping.frahost;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TabHost;

/**
 * Created by 邹家豪 on 2017/4/15.
 */
public class FragmentTabHost extends TabHost {

    public FragmentTabHost(Context context) {
        super(context);
    }

    public FragmentTabHost(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FragmentTabHost(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FragmentTabHost(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
