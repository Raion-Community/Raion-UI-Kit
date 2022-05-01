package com.example.raiondialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
/**
 * Copyrighted to Fahmi Noordin Rumagutawan (2022)
 * Created to contribute in Raion UI-KIT
 */

class RaionDialog {

    class ConfirmationDialog {
        private var layout = R.layout.confirm_dialog_center
        private var animation = R.style.center_animation
        private var bgLayoutId = R.id.center_background
        private var iconId = R.id.center_icon_iv
        private var textId = R.id.center_text_tv
        private var leftBtnId = R.id.center_yes_btn
        private var rightBtnId = R.id.center_no_btn

        /**[START] Set button color*/
        private var leftButtonColor = R.color.DefaultCyan
        private var rightButtonColor = R.color.DefaultRed
        fun setButtonColor(
            leftId: Int = R.color.DefaultCyan,
            rightId: Int = R.color.DefaultRed
        ) = apply {
            leftButtonColor = leftId
            rightButtonColor = rightId
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


        /** I still couldn't implement this */
        /**[START]*/
//        private var position = DialogPosition.CENTER
//        fun setPosition(position: DialogPosition) = apply {
//            this.position = position
//
//            when (position) {
//                DialogPosition.TOP -> {
                    //Happens here is, we change all the ID of the component.
//                }
//                DialogPosition.BOTTOM -> {
                    //Happens here is, we change all the ID of the component.
//                }
//                DialogPosition.CENTER -> {
//                    /**Center position is shouldn't implemented, because all default attributes is center*/
//                }
//            }
//        }
        /**[END]*/


        /**[START] Set custom icon*/
        private var iconRes = R.drawable.icon_raion
        private var iconTint = R.color.DefaultBlack
        fun setIcon(iconId: Int, iconTint: Int = R.color.DefaultBlack) = apply {
            iconRes = iconId
            this.iconTint = iconTint
        }

        /**[END]*/


        @SuppressLint("ResourceAsColor")
        fun build(
            context: Context,
            onLeftBtnClick: () -> Unit,
            onRightBtnClick: () -> Unit
        ): Dialog {
            val dialog = Dialog(context)
            dialog.setContentView(this.layout)

            //Set the background
            var background = dialog.findViewById<LinearLayout>(bgLayoutId).background
            var window = dialog.window

            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            background.setTint(backgroundColor)
            background.setTintMode(PorterDuff.Mode.SRC_ATOP)

            //Set Icon
            var iconIv = dialog.findViewById<ImageView>(iconId)
            iconIv.setImageResource(iconRes)

            //Set text
            var mainTextview = dialog.findViewById<TextView>(textId)
            mainTextview.text = this.text
            mainTextview.setTextColor(textColor)

            //Settings for buttons
            var leftBtn = dialog.findViewById<Button>(leftBtnId)
            var rightBtn = dialog.findViewById<Button>(rightBtnId)

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
                onLeftBtnClick()
            }
            rightBtn.setOnClickListener {
                onRightBtnClick()
            }

            return dialog
        }
    }

    /**On the future, I would like to add more custom dialog which more clear and nice*/
}