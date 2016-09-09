package com.jeongho.viewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jeongho on 2016/9/9.
 */
public abstract class BaseActivity extends AppCompatActivity{

    public abstract void initView();
    public abstract void initData();
    public abstract void initListener();
    public abstract int getContentViewId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        initView();
        initData();
        initListener();
    }
}
