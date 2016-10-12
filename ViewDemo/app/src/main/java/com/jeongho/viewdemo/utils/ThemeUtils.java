package com.jeongho.viewdemo.utils;

import android.app.Activity;

import com.jeongho.viewdemo.R;

/**
 * Created by Jeongho on 2016/10/11.
 */

public class ThemeUtils {

    public static boolean isDay = true;

    public static void changeTheme(Activity aty){
        if (isDay){
            aty.setTheme(R.style.CustomTheme_Day);
        }else {
            aty.setTheme(R.style.CustomTheme_Night);
        }
    }
}
