package com.jeongho.viewdemo;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;

import java.util.Calendar;

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

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            View decorView = getWindow().getDecorView();
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(calendar.HOUR);
            Log.d("hour", "" + hour);
            int option = 0;
            if (hour != 9){
                //日间
                setTheme(R.style.CustomTheme_Day);
                option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

            }else {
                //夜间
                setTheme(R.style.CustomTheme_Night);
                option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            }
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }


        setContentView(getContentViewId());
        initView();
        initData();
        initListener();
    }
}
