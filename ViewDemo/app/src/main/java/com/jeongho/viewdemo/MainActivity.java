package com.jeongho.viewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jeongho.viewdemo.statusbar.StatusBarAty;
import com.jeongho.viewdemo.toolbar.CustomToolbarAty;
import com.jeongho.viewdemo.toolbar.ToolbarActivity;
import com.jeongho.viewdemo.utils.ThemeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.btn_toolbar) Button mToolbarBtn;
    @BindView(R.id.btn_custom_toolbar) Button mCustomToolbarBtn;
    @BindView(R.id.btn_statusbar_activity) Button mStatusBarAtyBtn;
    @BindView(R.id.btn_change_theme) Button mChangeThemeBtn;

    /**
     * Toolbar Activity
     */
    @OnClick(R.id.btn_toolbar) void goToToolbarAty(){
        ToolbarActivity.startAction(this);
    }
    /**
     *  change the theme of MainActivity
     */
    @OnClick(R.id.btn_change_theme) void changeAtyTheme(){
        Toast.makeText(this, "aaa", Toast.LENGTH_SHORT).show();
        ThemeUtils.isDay = !ThemeUtils.isDay;
        //ThemeUtils.changeTheme(this);
        MainActivity.this.recreate();
    }
    /**
     * 自定义Toolbar Activity
     */
    @OnClick(R.id.btn_custom_toolbar) void goToCustomToolbarAty(){
        CustomToolbarAty.startAction(this);
    }
    /**
     * status Bar Activity
     */
    @OnClick(R.id.btn_statusbar_activity) void goToStatusBarAty(){
        StatusBarAty.startAction(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ThemeUtils.changeTheme(this);
        if (ThemeUtils.isDay = true){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }else {
            //getWindow().getDecorView().setSystemUiVisibility(View.de);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


}
