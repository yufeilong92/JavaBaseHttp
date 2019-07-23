package com.yfl.javabasehttp.mvp.Model

import android.content.Context
import com.yfl.javabasehttp.mvp.Contrat.MainView
import com.yfl.javabasehttp.retrofit.Request_Net
import com.yfl.javabasehttp.mvp.ResultView.RequestResultInterface

/**
 * @Author : YFL  is Creating a porject in tsyc
 * @Package com.example.tsyc.mvp.Model
 * @Email : yufeilong92@163.com
 * @Time :2019/7/4 16:09
 * @Purpose :主界面数据层
 */
class MainModel : MainView.Model {
    override fun requestGson(context: Context, request: RequestResultInterface) {
        Request_Net.getText(context,{
            request.Success(it)
        }, {
            request.onComplise()

        }, {
            request.onError(it)
        })
    }
}