package com.jeongho.viewdemo.toolbar;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.jeongho.viewdemo.BaseActivity;
import com.jeongho.viewdemo.R;

/**
 * Created by Jeongho on 2016/9/9.
 */
public class CustomToolbarAty extends BaseActivity{
    private String TAG = getClass().getName();
    private CustomToolbar mCustomToolbar;
    @Override
    public void initView() {
        mCustomToolbar = (CustomToolbar) findViewById(R.id.ct);
    }

    @Override
    public void initData() {
        //mCustomToolbar.setTitle(R.string.home);
    }

    @Override
    public void initListener() {
        mCustomToolbar.setRightOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "right clicked");
            }
        });
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_custom_toolbar;
    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, CustomToolbarAty.class);
        context.startActivity(intent);
    }
}
