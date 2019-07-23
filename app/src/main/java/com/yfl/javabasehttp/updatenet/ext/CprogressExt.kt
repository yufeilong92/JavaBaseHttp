@file:Suppress("NOTHING_TO_INLINE")

package com.yfl.javabasehttp.updatenet.ext

import android.app.Activity
import com.yfl.javabasehttp.updatenet.util.CProgressDialogUtils

/**
 * Created by Vector
 * on 2017/7/18 0018.
 */
inline fun Activity.showProgressDialog(m:Activity) {
    CProgressDialogUtils.showProgressDialog(m)
}

inline fun Activity.cancelProgressDialog(m:Activity) {
    CProgressDialogUtils.cancelProgressDialog(m)
}