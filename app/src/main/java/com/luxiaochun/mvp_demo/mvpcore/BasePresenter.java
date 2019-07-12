package com.luxiaochun.mvp_demo.mvpcore;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:52
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public class BasePresenter<V extends BaseView> {
    private V mView;

    /**
     * 绑定view
     * 请求过程中当前Activity突然因为某种原因被销毁，Presenter收到后台反馈并调用View接口处理UI逻辑时由于Activity已经被销毁，就会引发空指针异常。
     * 想要避免这种情况的发生就需要每次调用View前都知道宿主Activity的生命状态。
     *
     * @param view
     */
    public void attachView(V view) {
        mView = view;
    }

    /**
     * 解绑view
     */
    public void detachView() {
        mView = null;
    }

    /**
     * 是否与View进行连接
     *
     * @return
     */
    public boolean isViewAttached() {
        return mView != null;
    }

    /**
     * 获取连接的view
     */
    public V getView(){
        return mView;
    }

}
