package com.yfl.javabasehttp.base

import android.content.Context
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.yfl.javabasehttp.R

class BaseAdapter(var context: Context, var infoList: MutableList<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_test, infoList) {

    override fun convert(helper: BaseViewHolder?, item: String?) {
        val position = helper!!.layoutPosition
    }

}