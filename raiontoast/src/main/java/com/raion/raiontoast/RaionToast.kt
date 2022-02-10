package com.raion.raiontoast

import android.content.Context
import com.raion.raiontoast.config.RaionToastConfig

class RaionToast {
    companion object {
        fun getToastBuilder(context: Context) = RaionToastConfig.Builder(context)
    }
}