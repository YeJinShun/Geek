package com.example.dell.geek.base;

public interface BaseView<K , T> {
    void onSuccess(K k);
    void onFail(T t);
}
