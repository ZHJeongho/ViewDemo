package com.jeongho.viewdemo.toolbar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

/**
 * Created by Jeongho on 2016/9/9.
 */
public class customToolbar extends Toolbar{
    public customToolbar(Context context) {
        this(context, null);
    }

    public customToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public customToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }
}
