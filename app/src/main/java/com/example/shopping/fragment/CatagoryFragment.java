package com.example.shopping.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping.R;

/**
 * Created by 邹家豪 on 2016/9/28.
 */
public class CatagoryFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fgmt_catagory,container,false);
        return  view;
    }
}
