package com.luxiaochun.mvp_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luxiaochun.mvp_demo.mvpcore.BasePresenter;
import com.luxiaochun.mvp_demo.mvpcore.BaseView;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 14:15
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {
    /**
     * 获取Presenter实例，子类实现
     */
    public abstract BasePresenter getPresenter();

    /**
     * 初始化Presenter的实例，子类实现
     */
    public abstract void initPresenter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        if (getPresenter() != null){
            getPresenter().attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (getPresenter() != null){
            getPresenter().detachView();
        }
    }
}
