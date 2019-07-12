package com.luxiaochun.mvp_demo.mvpcore;

import com.luxiaochun.mvp_demo.model.DataModel;
import com.luxiaochun.mvp_demo.model.Model;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 10:16
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public class Presenter extends BasePresenter<IView> {

    public void getData(String params) {
        getView().showLoading();
        DataModel.request(Model.class).params(params).excute(new Callback<String>() {
            @Override
            public void onSuccess(String data) {
                if (isViewAttached()) {
                    getView().hideLoading();
                    getView().showData(data);
                }
            }

            @Override
            public void onFailure(String msg) {

            }
        });
    }
}
