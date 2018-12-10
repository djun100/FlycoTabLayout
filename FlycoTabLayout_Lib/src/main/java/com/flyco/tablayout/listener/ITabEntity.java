package com.flyco.tablayout.listener;

import android.support.annotation.DrawableRes;

public interface ITabEntity {
    String getTabTitle();

    @DrawableRes
    int getTabSelectedIcon();

    @DrawableRes
    int getTabUnselectedIcon();
}