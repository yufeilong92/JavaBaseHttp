package com.yfl.javabasehttp.mvp.ResultView

interface RequestResultInterface{
    fun<T> Success(t: T);
    fun onError(ex: Throwable);
    fun onComplise();
}
