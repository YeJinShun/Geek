package com.example.dell.geek.base;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseMvpActivity<P extends BasePresenter,M extends BaseModel,V extends BaseView> extends BaseActivity {
    protected P presenter;
    /*@Override
    protected void initMvp(){
        presenter = initMvpPresenter();
        if (presenter !=null){
            presenter.setModel(initMvpModel());
            presenter.setView(initMvpView());
        }
    }*/

    protected abstract V initMvpView();

    protected abstract M initMvpModel();

    protected abstract P initMvpPresenter();
}
