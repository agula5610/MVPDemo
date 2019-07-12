package com.luxiaochun.mvp_demo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.luxiaochun.mvp_demo.mvpcore.BasePresenter;
import com.luxiaochun.mvp_demo.mvpcore.IView;
import com.luxiaochun.mvp_demo.mvpcore.Presenter;

public class MainActivity extends BaseActivity implements IView {
    //进度条
    ProgressDialog progressDialog;
    TextView text;
    Button request;

    Presenter presenter;

    @Override
    public BasePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void initPresenter() {
        presenter = new Presenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.tv);
        request = findViewById(R.id.request);
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("正在加载数据");
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getData("success");
            }
        });
    }

    @Override
    public void showLoading() {
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
