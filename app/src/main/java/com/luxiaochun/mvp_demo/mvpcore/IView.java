package com.luxiaochun.mvp_demo.mvpcore;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:15
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public interface IView extends BaseView{
    /**
     * 当数据请求成功后，调用此接口显示数据
     * @param data 数据源
     */
    void showData(String data);
}
