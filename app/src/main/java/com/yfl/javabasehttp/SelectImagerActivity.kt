package com.yfl.javabasehttp

import android.os.Bundle
import android.widget.Button
import com.backpacker.UtilsLibrary.kotlin.LogUtil
import com.yfl.javabasehttp.base.BaseSelectImageActivity

class SelectImagerActivity : BaseSelectImageActivity() {


    override fun setInitContentView(): Int {
        return R.layout.activity_select_imager
    }

    override fun onInitCreateView(savedInstanceState: Bundle?) {
        super.onInitCreateView(savedInstanceState)
        val btn_select = findViewById<Button>(R.id.btn_select)
        btn_select.setOnClickListener {
            toShowDialog(8)
        }

    }
    override fun onSelectImagePath(path: MutableList<String>) {
        for (item in path){
            LogUtil.i(item)
        }
    }
}
