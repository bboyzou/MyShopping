package com.example.shopping.selfview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.shopping.R;


/**
 * Created by 邹家豪 on 2016/10/6.
 */
public class CnToolbar extends Toolbar {
    private LayoutInflater minflater;
    private EditText et;
    private TextView tv;
    private ImageButton rightImgbt;//右边的返回按钮
    private ImageButton leftImgbt;//左边的返回按钮
    private View view;

    public CnToolbar(Context context) {
        this(context, null);
    }

    public CnToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CnToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        if (attrs != null) {
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(getContext(), attrs,
                    R.styleable.CnToolbar, defStyleAttr, 0);
            final Drawable rightIcon = a.getDrawable(R.styleable.CnToolbar_RightButton);
            final Drawable leftIcon = a.getDrawable(R.styleable.CnToolbar_LeftButton);
            if (rightIcon != null) {
                setRightImgbt(rightIcon);
            }
            if (leftIcon != null) {
                setLeftImgbt(leftIcon);
                Log.d("tag", "ssasas");
            }
            boolean isSearchView = a.getBoolean(R.styleable.CnToolbar_isSearchView, false);
            if (isSearchView == true) {
                showSearchView();
            }
            a.recycle();
        }

    }

    private void initView() {
        if (view == null) {
            minflater = LayoutInflater.from(getContext());
            view = minflater.inflate(R.layout.toolbar, null);
            et = (EditText) view.findViewById(R.id.toolbar_searchview);
            tv = (TextView) view.findViewById(R.id.toolbar_title);
            rightImgbt = (ImageButton) view.findViewById(R.id.toolbar_rightButton);
            leftImgbt = (ImageButton) view.findViewById(R.id.toolbar_leftButton);
            LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);
            addView(view, lp);
        }
    }


    public void setRightImgbt(Drawable drawable) {
        if (rightImgbt != null) {
            rightImgbt.setImageDrawable(drawable);
            showRightImageButton();
        }
    }

    public void setRightbuttonOnClickListtener(OnClickListener li) {
        rightImgbt.setOnClickListener(li);
    }

    public void setLeftImgbt(Drawable drawable) {
        if (leftImgbt != null) {
            leftImgbt.setImageDrawable(drawable);
            leftImgbt.setVisibility(VISIBLE);
            Log.d("tag", "wolaile");
        }
    }

    public void setLeftbuttonOnClickListtener(OnClickListener li) {
        leftImgbt.setOnClickListener(li);
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        initView();
        if (tv != null) {
            tv.setText(title);
            showTextView();
        }

    }

    public void showTextView() {
        if (tv != null) {
            tv.setVisibility(VISIBLE);
        }
    }

    public void hideTextView() {
        if (tv != null) {
            tv.setVisibility(GONE);
        }
    }


    public void showRightImageButton() {
        if (rightImgbt != null) {
            rightImgbt.setVisibility(VISIBLE);
        }
    }

    public void hideRightImageButton() {
        if (rightImgbt != null) {
            rightImgbt.setVisibility(GONE);
        }
    }

    public void showLeftImageButton() {
        if (leftImgbt != null) {
            leftImgbt.setVisibility(VISIBLE);
        }
    }

    public void hideLeftImageButton() {
        if (leftImgbt != null) {
            leftImgbt.setVisibility(GONE);
        }
    }

    public void showSearchView() {
        if (et != null) {
            et.setVisibility(VISIBLE);
            hideTextView();
            hideLeftImageButton();

        }
    }

    public void hideSearchView() {
        if (et != null) {
            et.setVisibility(GONE);
        }
    }

}
