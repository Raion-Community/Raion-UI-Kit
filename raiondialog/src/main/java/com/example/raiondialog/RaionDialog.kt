package com.example.raiondialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.raiondialog.utils.DialogType

/**
 * Copyrighted to Fahmi Noordin Rumagutawan (2022)
 * Created to contribute in Raion UI-KIT
 */

class RaionDialog {

    class Confirmation {
        /**[START] Initializing what required*/
        private var gravity = Gravity.CENTER
        private var animation = R.style.center_animation
        private var layout = R.layout.confirm_dialog_center
        private var yesBtn = R.id.center_yes_btn
        private var noBtn = R.id.center_no_btn
        private var dialogBG = R.id.center_background
        private var dialogIcon = R.id.center_icon_iv
        private var dialogText = R.id.center_text_tv
        /**[END]*/


        /**[START] Set button color*/
        private var leftButtonColor = R.color.DefaultCyan
        private var rightButtonColor = R.color.DefaultRed
        fun setButtonColor(
            yesColorId: Int = R.color.DefaultCyan,
            noColorId: Int = R.color.DefaultRed
        ) = apply {
            leftButtonColor = yesColorId
            rightButtonColor = noColorId
        }
        /**[END]*/


        /**[START] Set button text*/
        private var leftButtonText = "Yes"
        private var leftButtonTextColor = R.color.DefaultBlack
        private var rightButtonText = "No"
        private var rightButtonTextColor = R.color.DefaultBlack
        fun setButtonText(
            leftText: String = "Yes",
            rightText: String = "No",
            leftTextColor: Int = R.color.DefaultBlack,
            rightTextColor: Int = R.color.DefaultBlack
        ) = apply {
            leftButtonText = leftText
            rightButtonText = rightText
            this.leftButtonTextColor = leftTextColor
            this.rightButtonTextColor = rightTextColor
        }
        /**[END]*/


        /**[START] Set dialog text*/
        private var text = "Confirm?"
        private var textColor = R.color.DefaultBlack
        fun setText(text: String, textColor: Int = R.color.DefaultBlack) = apply {
            this.text = text
            this.textColor = textColor
        }
        /**[END]*/


        /**[START] Set background color*/
        private var backgroundColor = Color.WHITE
        fun setBackgroundColor(colorId: Int) = apply {
            backgroundColor = colorId
        }
        /**[END]*/


        /**[START] Set custom icon*/
        private var iconRes = R.drawable.icon_raion
        private var iconTint = R.color.DefaultBlack
        fun setIcon(iconId: Int, iconTint: Int = R.color.DefaultBlack) = apply {
            iconRes = iconId
            this.iconTint = iconTint
        }
        /**[END]*/


        /**[START] Set dialog type*/
        fun setType(dialogType: DialogType) = apply {
            when (dialogType) {
                DialogType.TOP -> {
                    layout = R.layout.confirm_dialog_top
                    animation = R.style.top_animation
                    gravity = Gravity.TOP
                    dialogBG = R.id.top_background
                    dialogIcon = R.id.top_icon_iv
                    dialogText = R.id.top_text_tv
                    yesBtn = R.id.top_yes_btn
                    noBtn = R.id.top_no_btn
                }
                DialogType.CENTER -> {
                    layout = R.layout.confirm_dialog_center
                    animation = R.style.center_animation
                    gravity = Gravity.CENTER
                    dialogBG = R.id.center_background
                    dialogIcon = R.id.center_icon_iv
                    dialogText = R.id.center_text_tv
                    yesBtn = R.id.center_yes_btn
                    noBtn = R.id.center_no_btn
                }
                DialogType.BOTTOM -> {
                    layout = R.layout.confirm_dialog_bottom
                    animation = R.style.bottom_animation
                    gravity = Gravity.BOTTOM
                    dialogBG = R.id.bottom_background
                    dialogIcon = R.id.bottom_icon_iv
                    dialogText = R.id.bottom_text_tv
                    yesBtn = R.id.bottom_yes_btn
                    noBtn = R.id.bottom_no_btn
                }
            }
        }
        /**[END]*/


        /**BUILD FUNCTION**/
        @SuppressLint("ResourceAsColor")
        fun build(
            context: Context,
            onYesBtnClick: () -> Unit,
            onNoBtnClick: () -> Unit
        ): Dialog {
            val dialog = Dialog(context)
            dialog.setContentView(layout)

            //Set some settings
            var window = dialog.window
            window?.setGravity(gravity)

            //Set the background
            var background = dialog.findViewById<LinearLayout>(dialogBG).background
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            background.setTint(backgroundColor)
            background.setTintMode(PorterDuff.Mode.SRC_ATOP)

            //Set animation
            window?.attributes?.windowAnimations = animation

            //Set Icon
            var iconIv = dialog.findViewById<ImageView>(dialogIcon)
            iconIv.setImageResource(iconRes)

            //Set text
            var mainTextview = dialog.findViewById<TextView>(dialogText)
            mainTextview.text = this.text
            mainTextview.setTextColor(textColor)

            //Settings for buttons
            var leftBtn = dialog.findViewById<Button>(yesBtn)
            var rightBtn = dialog.findViewById<Button>(noBtn)

            //Set btn color
            var leftBtnBackground = leftBtn.background
            leftBtnBackground.setAlpha(100)
            leftBtnBackground.setTint(leftButtonColor)

            var rightBtnBackground = rightBtn.background
            rightBtnBackground.setAlpha(100)
            rightBtnBackground.setTint(rightButtonColor)

            //Set btn text color
            leftBtn.setTextColor(leftButtonTextColor)
            rightBtn.setTextColor(rightButtonTextColor)

            //Set btn clickListener
            leftBtn.setOnClickListener {
                onYesBtnClick()
            }
            rightBtn.setOnClickListener {
                onNoBtnClick()
            }

            return dialog
        }
    }

}
