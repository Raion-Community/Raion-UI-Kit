package com.raion.raionsnackbar

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.raion.raionsnackbar.databinding.SnackbarLayoutBinding

@SuppressLint("ShowToast")
class RaionSneeze  {
    companion object {

        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeInfoSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
            val sneezeLayout = snackBar.view as Snackbar.SnackbarLayout

            val binding = buildSneeze(view)
            binding.apply {
                Glide.with(view).load(R.drawable.ic_info).into(ivIcon)
                tvMessage.text = text
                container.background = view.context.getDrawable(R.color.blue)
                sneezeLayout.addView(binding.root, -1, -1)
            }
            return snackBar
        }

        fun showInfoSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeInfoSneeze(view, text, duration).show()

        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeSuccessSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            val sneezeLayout = snackBar.view as Snackbar.SnackbarLayout

            val binding = buildSneeze(view)
            binding.apply {
                Glide.with(view).load(R.drawable.ic_success).into(ivIcon)
                tvMessage.text = text
                container.background = view.context.getDrawable(R.color.green)
                sneezeLayout.addView(binding.root)
            }
            return snackBar
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        fun showErrorSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            val sneezeLayout = snackBar.view as Snackbar.SnackbarLayout

            val binding = buildSneeze(view)
            binding.apply {
                Glide.with(view).load(R.drawable.ic_info).into(ivIcon)
                tvMessage.text = text
                container.background = view.context.getDrawable(R.color.red)
                sneezeLayout.addView(binding.root)
            }
            return snackBar
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        fun showWarningSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            val sneezeLayout = snackBar.view as Snackbar.SnackbarLayout

            val binding = buildSneeze(view)
            binding.apply {
                Glide.with(view).load(R.drawable.ic_warning).into(ivIcon)
                tvMessage.text = text
                container.background = view.context.getDrawable(R.color.yellow)
                sneezeLayout.addView(binding.root)
            }
            return snackBar
        }

        private fun buildSneeze(view: View) =
            SnackbarLayoutBinding.inflate(LayoutInflater.from(view.context))
    }
}