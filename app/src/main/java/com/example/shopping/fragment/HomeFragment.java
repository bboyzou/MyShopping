package com.example.shopping.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping.R;
import com.example.shopping.selfview.CnToolbar;

/**
 * Created by 邹家豪 on 2016/9/28.
 */
public class HomeFragment extends Fragment {
    CnToolbar cnToolbar;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fgmt_home,container,false);
        initView(view);
        return  view;
    }
    private void initView(View view) {
        cnToolbar = (CnToolbar)view.findViewById(R.id.home_toolbar);
       // cnToolbar.setTitle("主页");
        //cnToolbar.showEditView();

    }

}
