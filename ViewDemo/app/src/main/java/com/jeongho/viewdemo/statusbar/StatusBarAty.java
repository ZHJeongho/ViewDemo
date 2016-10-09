package com.jeongho.viewdemo.statusbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.View;

import com.jeongho.viewdemo.BaseActivity;
import com.jeongho.viewdemo.R;

/**
 * Created by Jeongho on 16/10/9.
 */

public class StatusBarAty extends BaseActivity {
    @Override
    public void initView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_statusbar;
    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, StatusBarAty.class);
        context.startActivity(intent);
    }
}
