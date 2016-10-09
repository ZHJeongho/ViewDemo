package com.jeongho.viewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.jeongho.viewdemo.statusbar.StatusBarAty;
import com.jeongho.viewdemo.toolbar.CustomToolbarAty;
import com.jeongho.viewdemo.toolbar.ToolbarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.btn_toolbar) Button mToolbarBtn;
    @BindView(R.id.btn_custom_toolbar) Button mCustomToolbarBtn;
    @BindView(R.id.btn_statusbar_activity) Button mStatusBarAtyBtn;

    @OnClick(R.id.btn_toolbar) void goToToolbarAty(){
        ToolbarActivity.startAction(this);
    }

    @OnClick(R.id.btn_custom_toolbar) void goToCustomToolbarAty(){
        CustomToolbarAty.startAction(this);
    }

    @OnClick(R.id.btn_statusbar_activity) void goToStatusBarAty(){
        StatusBarAty.startAction(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


}
