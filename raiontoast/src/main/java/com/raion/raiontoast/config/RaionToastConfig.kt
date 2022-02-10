package com.raion.raiontoast.config

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.raion.raiontoast.R
import com.raion.raiontoast.databinding.RaionToastLayoutBinding
import com.raion.raiontoast.util.ToastShape
import com.raion.raiontoast.util.ToastType

class RaionToastConfig private constructor(
    private val context: Context,
    private var text: String = "",
    private var toastType: ToastType = ToastType.INFO,
    private var showLogo: Boolean = true,
    private var duration: Int = Toast.LENGTH_SHORT,
    private var toastShape: ToastShape = ToastShape.ROUNDED,
) {
    private val Int.dp: Int
        get() = (this * Resources.getSystem().displayMetrics.density).toInt()

    private fun build(): Toast {
        val toast = Toast(context)
        val layout = RaionToastLayoutBinding.inflate(LayoutInflater.from(context), null, false)
        layout.apply {
            when (toastShape) {
                ToastShape.ROUNDED -> toastLayoutParent.background =
                    ResourcesCompat.getDrawable(context.resources, R.drawable.rounded_shape, null)
                ToastShape.RECTANGLE -> toastLayoutParent.background =
                    ResourcesCompat.getDrawable(context.resources, R.drawable.rectangle_shape, null)
            }

            when (toastType) {
                ToastType.NORMAL -> {
                    toastLayoutParent.background.setTint(
                        ContextCompat.getColor(
                            context,
                            R.color.grayNormal
                        )
                    )
                    val params = toastText.layoutParams as ViewGroup.MarginLayoutParams
                    params.apply {
                        marginStart = 8.dp
                        topMargin = 8.dp
                        bottomMargin = 8.dp
                    }
                    toastText.layoutParams = params
                    toastTypeIv.visibility = View.GONE
                }
                ToastType.SUCCESS -> {
                    toastLayoutParent.background.setTint(
                        ContextCompat.getColor(
                            context,
                            R.color.greenSuccess
                        )
                    )
                    toastTypeIv.setImageResource(R.drawable.ic_success)
                }
                ToastType.ERROR -> {
                    toastLayoutParent.background.setTint(
                        ContextCompat.getColor(
                            context,
                            R.color.redError
                        )
                    )
                    toastTypeIv.setImageResource(R.drawable.ic_error)
                }
                ToastType.WARNING -> {
                    toastLayoutParent.background.setTint(
                        ContextCompat.getColor(
                            context,
                            R.color.orangeWarning
                        )
                    )
                    toastTypeIv.setImageResource(R.drawable.ic_warning)
                }
                ToastType.INFO -> {
                    toastLayoutParent.background.setTint(
                        ContextCompat.getColor(
                            context,
                            R.color.blueInfo
                        )
                    )
                    toastTypeIv.setImageResource(R.drawable.ic_info)
                }
            }

            toastText.text = text

            toast.apply {
                duration = duration
                view = layout.root
            }
        }

        return toast
    }

    class Builder(private val context: Context) {
        private var text: String = ""
        private var toastType: ToastType = ToastType.INFO
        private var showLogo: Boolean = true
        private var duration: Int = Toast.LENGTH_SHORT
        private var toastShape: ToastShape = ToastShape.ROUNDED

        fun setText(text: String) = apply { this.text = text }

        fun setToastType(toastType: ToastType) = apply { this.toastType = toastType }

        fun setLogoVisibility(showLogo: Boolean) = apply { this.showLogo = showLogo }

        fun setDuration(duration: Int) = apply { this.duration = duration }

        fun setToastShape(toastShape: ToastShape) = apply { this.toastShape = toastShape }

        fun build() = RaionToastConfig(context, text, toastType, showLogo, duration, toastShape).build()
    }

}