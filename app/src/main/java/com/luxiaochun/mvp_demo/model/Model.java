package com.luxiaochun.mvp_demo.model;

import android.os.Handler;

import com.luxiaochun.mvp_demo.mvpcore.Callback;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:14
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public class Model extends BaseModel<String, String> {

    @Override
    public void excute(final Callback<String> callback) {
        // 利用postDelayed方法模拟网络请求数据的耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (params) {
                    case "success":
                        callback.onSuccess("根据参数" + params + "的请求网络数据成功");
                        break;

                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                }
            }

        }, 2000);
    }
}
