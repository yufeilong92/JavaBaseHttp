package com.yfl.javabasehttp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.yfl.javabasehttp.base.BaseActivity
import com.yfl.javabasehttp.R
import com.yfl.javabasehttp.adapter.GuideAdapter
import com.yfl.javabasehttp.fragment.GuideFragment

/**
 * @Title:
 * @Package
 * @Description: todo
 * @author: L-BackPacker
 * @date:   2019/7/6 12:41
 * @version V 1.0 xxxxxxxx
 * @verdescript  版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019/7/6
 */
class GuideActivity : BaseActivity() {
    private var viewpager_content:ViewPager?=null
    override fun setInitContentView(): Int {
        return R.layout.activity_guide
    }

    override fun onInitCreateView(savedInstanceState: Bundle?) {
        initFragment()
        viewpager_content = findViewById<ViewPager>(R.id.viewpager_content)
    }

    fun initFragment() {
        val listFragment = mutableListOf<Fragment>()
        for (postion in 0 until 3) {
            val fragment = GuideFragment.newInstance("$postion", "")
            listFragment.add(fragment)
        }
        val adapter = GuideAdapter(fm = supportFragmentManager, list = listFragment)
        viewpager_content!!.adapter = adapter
    }


}
