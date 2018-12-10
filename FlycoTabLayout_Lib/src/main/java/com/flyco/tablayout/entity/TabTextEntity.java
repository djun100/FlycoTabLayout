package com.flyco.tablayout.entity;

import com.flyco.tablayout.listener.ITabEntity;

public class TabTextEntity implements ITabEntity {
    public String title;

    public TabTextEntity(String title) {
        this.title = title;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    /**不会用到，返回任意值即可
     * @return
     */
    @Override
    public int getTabSelectedIcon() {
        return -1;
    }

    /**不会用到，返回任意值即可
     * @return
     */
    @Override
    public int getTabUnselectedIcon() {
        return -1;
    }
}
