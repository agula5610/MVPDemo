package com.luxiaochun.mvp_demo.model;

/**
 * ProjectName: MVPDemo
 * PackageName: com.luxiaochun.mvp_demo
 * Author: jun
 * Date: 2019-07-12 14:08
 * Copyright: (C)HESC Co.,Ltd. 2016. All rights reserved.
 */
public class DataModel {
    public static <T extends BaseModel> T request(Class<T> cls){
        // 声明一个空的BaseModel
        T model = null;
        try {
            //利用反射机制获得对应Model对象的引用
            model = (T) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }
}
