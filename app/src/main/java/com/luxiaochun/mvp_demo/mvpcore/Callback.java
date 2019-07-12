package com.luxiaochun.mvp_demo.mvpcore;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:13
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public interface Callback<T> {
    /**
     * 数据请求成功
     * @param data 请求到的数据
     */
    void onSuccess(T data);

    /**
     *  使用网络API接口请求方式时，虽然已经请求成功但是由
     *  于{@code msg}的原因无法正常返回数据。
     */
    void onFailure(String msg);
}
