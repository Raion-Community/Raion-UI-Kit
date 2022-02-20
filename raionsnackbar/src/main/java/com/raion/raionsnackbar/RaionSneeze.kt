package com.raion.raionsnackbar

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.raion.raionsnackbar.databinding.SnackbarLayoutBinding

/**
 * RaionSneeze
 * Copyright (c) 2021 all rights reserved.
 * Created by Kylix Eza Saputra as Head of Programmer Division Raion Community.
 * Contact me if you find any bugs or just want to collaborate in this project
 */

@SuppressLint("ShowToast")
class RaionSneeze  {
    companion object {

        /**
         * * Call this function to make a normal snackbar and customized it by yourself
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
        */
        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeNormalSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {
            val snackBar = Snackbar.make(view, text, duration)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
            val sneezeLayout = snackBar.view as Snackbar.SnackbarLayout

            val binding = buildSneeze(view)
            binding.apply {
                ivIcon.visibility = View.GONE
                tvMessage.text = text
                container.background = view.context.getDrawable(R.color.gray)
                sneezeLayout.addView(binding.root, -1, -1)
            }
            return snackBar
        }

        /**
         * * Call this function to show a normal snackbar
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        fun showNormalSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeNormalSneeze(view, text, duration).show()

        /**
         * * Call this function to make an info snackbar and customized it by yourself
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
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

        /**
         * * Call this function to show a info snackbar
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        fun showInfoSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeInfoSneeze(view, text, duration).show()

        /**
         * * Call this function to make an success snackbar and customized it by yourself
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeSuccessSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
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

        /**
         * * Call this function to show a success snackbar
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        fun showSuccessSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeSuccessSneeze(view, text, duration).show()


        /**
         * * Call this function to make an error snackbar and customized it by yourself
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeErrorSneeze(
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
                container.background = view.context.getDrawable(R.color.red)
                sneezeLayout.addView(binding.root)
            }
            return snackBar
        }

        /**
         * * Call this function to show a error snackbar
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        fun showErrorSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeErrorSneeze(view, text, duration).show()

        /**
         * * Call this function to make an warning snackbar and customized it by yourself
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        @SuppressLint("UseCompatLoadingForDrawables")
        fun makeWarningSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ): Snackbar {

            val snackBar = Snackbar.make(view, text, duration)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
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

        /**
         * * Call this function to show a warning snackbar
         *
         * @param view to set view parent that snackbar would be placed
         * @param text to handle message that will shown from the snackbar
         * @param duration to control duration of your toast (LENGTH_LONG, LENGTH_SHORT, or LENGTH_INDEFINITE)
         */
        fun showWarningSneeze(
            view: View,
            text: String = "",
            duration: Int = Snackbar.LENGTH_SHORT
        ) = makeErrorSneeze(view, text, duration).show()

        private fun buildSneeze(view: View) =
            SnackbarLayoutBinding.inflate(LayoutInflater.from(view.context))
    }
}