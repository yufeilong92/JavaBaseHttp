package com.yfl.javabasehttp.mvp.ResultView

interface StringResultInterface{
    fun<T> Success(t: T);
    fun onError(ex: Throwable);
    fun onComplise();

}