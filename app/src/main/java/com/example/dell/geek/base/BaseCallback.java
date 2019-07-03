package com.example.dell.geek.base;

public interface BaseCallback<K , T> {
    void onSuccess(K k);
    void onFail(T t);
}
