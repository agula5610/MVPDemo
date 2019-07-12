package com.luxiaochun.mvp_demo.mvpcore;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:52
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public interface BaseView {
    /**
     * 显示正在加载进度框
     */
    void showLoading();

    /**
     * 隐藏正在加载进度框
     */
    void hideLoading();
}
