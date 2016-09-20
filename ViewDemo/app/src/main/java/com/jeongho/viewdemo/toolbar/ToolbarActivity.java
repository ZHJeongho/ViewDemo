package com.jeongho.viewdemo.toolbar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.jeongho.viewdemo.BaseActivity;
import com.jeongho.viewdemo.R;

/**
 * Created by Jeongho on 2016/9/9.
 */
public class ToolbarActivity extends BaseActivity implements Toolbar.OnMenuItemClickListener {

    private Toolbar mToolbar;
    @Override
    public void initView() {
        mToolbar = initToolbar(this, R.id.toolbar, "Title", R.drawable.align_justify);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToolbarActivity.this, "Navigation clicked", Toast.LENGTH_SHORT).show();
            }
        });
        //第三步
        mToolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_toolbar;
    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, ToolbarActivity.class);
        context.startActivity(intent);
    }

    //第二步
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public Toolbar initToolbar(AppCompatActivity activity, int viewId, String title, int navigationId){
        Toolbar toolbar = (Toolbar) activity.findViewById(viewId);
        toolbar.setTitle(title);
        toolbar.setNavigationIcon(navigationId);
        //第一步
        activity.setSupportActionBar(toolbar);
        return toolbar;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId){
            case R.id.menu_setting:
                Toast.makeText(ToolbarActivity.this, "menu_setting clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_quit:
                Toast.makeText(ToolbarActivity.this, "menu_quit clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
