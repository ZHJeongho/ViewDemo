package com.jeongho.viewdemo.toolbar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jeongho.viewdemo.R;

/**
 * Created by Jeongho on 2016/9/9.
 */
public class CustomToolbar extends Toolbar{

    private LayoutInflater mLayoutInflater;
    private View mCenterView;
    private TextView mCenterTv;
    private ImageButton mRightIb;
    public CustomToolbar(Context context) {
        this(context, null);
    }

    public CustomToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initCenterView();
    }

    private void initCenterView() {

        mLayoutInflater = LayoutInflater.from(getContext());
        mCenterView = mLayoutInflater.inflate(R.layout.custom_toolbar, null);
        mCenterTv = (TextView) mCenterView.findViewById(R.id.tv_center);
        mRightIb = (ImageButton) mCenterView.findViewById(R.id.ib_right);

        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);

        addView(mCenterView, layoutParams);
    }

    @Override
    public void setTitle(@StringRes int resId) {
        setTitle(getContext().getString(resId));
    }

    @Override
    public void setTitle(CharSequence title) {

        if (mLayoutInflater == null){
            initCenterView();
        }
        if (mCenterTv != null){
            mCenterTv.setText(title);
        }
    }

    public void setRightOnClickListener(OnClickListener listener){
        mRightIb.setOnClickListener(listener);
    }
}
