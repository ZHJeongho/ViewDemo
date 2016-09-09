package com.jeongho.viewdemo.toolbar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
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
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(R.string.toolbar_title);
        mToolbar.setSubtitle(R.string.toolbar_subtitle);
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
        mToolbar.setTitleTextColor(getResources().getColor(android.R.color.primary_text_light));
        mToolbar.inflateMenu(R.menu.toolbar_top_menu);
        setSupportActionBar(mToolbar);
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
        mToolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_toolbar;
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

    public static void startAction(Context context) {
        Intent intent = new Intent(context, ToolbarActivity.class);
        context.startActivity(intent);
    }
}
