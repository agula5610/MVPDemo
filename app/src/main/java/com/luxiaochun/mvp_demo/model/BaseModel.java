package com.luxiaochun.mvp_demo.model;

import com.luxiaochun.mvp_demo.mvpcore.Callback;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 14:01
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public abstract class BaseModel<T, V> {
    protected T params;

    public BaseModel params(T params) {
        this.params = params;
        return this;
    }

    public abstract void excute(Callback<V> callback);

    protected void requestGetAPI(String url,Callback<V> callback){
    }
}
