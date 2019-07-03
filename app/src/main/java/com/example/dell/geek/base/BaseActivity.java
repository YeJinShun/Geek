package com.example.dell.geek.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dell.geek.R;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(getLayoutId());
        setContentView(R.layout.activity_main);
        initMvp();
        initView();
        initData();
        initListener();

    }

    private void initMvp() {
    }

    protected abstract Bundle getLayoutId();




    private void initData() {

    }

    private void initListener() {
    }

    private void initView() {
    }


}
