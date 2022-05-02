package com.raion.raionuikit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.raiondialog.RaionDialog
import com.example.raiondialog.utils.DialogType
import com.raion.raionsnackbar.RaionSneeze
import com.raion.raiontoast.RaionToast
import com.raion.raiontoast.util.ToastType
import com.raion.raionuikit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = 0

        binding.btnTestToast.setOnClickListener {
            val toast = RaionToast.Builder()
                .setContext(this@MainActivity)
                .setText("Halo bang ini toast")
            when (i) {
                0 -> {
                    toast.setToastType(ToastType.SUCCESS)
                    i++
                }
                1 -> {
                    toast.setToastType(ToastType.WARNING)
                    i++
                }
                2 -> {
                    toast.setToastType(ToastType.NORMAL)
                    i++
                }
                3 -> {
                    toast.setToastType(ToastType.INFO)
                    i++
                }
                4 -> {
                    toast.setToastType(ToastType.ERROR)
                    i = 0
                }
            }
            toast.build().show()
        }


        binding.btnTestSnackbar.setOnClickListener {
            RaionSneeze.showInfoSneeze(
                findViewById(R.id.content), "Hello there this is raion snackbar"
            )
/*            Snackbar.make(
                findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_SHORT
            ).show()*/
/*            Snackbar.make(
                this,  findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_SHORT
            ).show()*/
        }

        binding.btnTopDialog.setOnClickListener {
            val dialog =
                RaionDialog
                    .Confirmation()
                    .setType(DialogType.TOP)
                    .setButtonText(
                        leftText = "KIRI",
                        rightText = "KANAN",
                        leftTextColor = Color.WHITE,
                        rightTextColor = Color.WHITE
                    )
                    .setButtonColor(
                        yesColorId = Color.BLUE,
                        noColorId = Color.RED)
                    .setText(
                        text = "Ini contoh TOP text",
                        textColor = Color.WHITE
                        )
                    .setBackgroundColor(Color.DKGRAY)
                    .build(
                        this,
                        onYesBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol YES diklik")
                            toast.setToastType(ToastType.SUCCESS)

                            toast.build().show()
                        },
                        onNoBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol NO diklik")
                            toast.setToastType(ToastType.WARNING)

                            toast.build().show()
                        })

            dialog.show()
        }

        binding.btnCenterDialog.setOnClickListener {
            val dialog =
                RaionDialog
                    .Confirmation()
                    .setButtonText(
                        leftText = "KIRI",
                        rightText = "KANAN",
                        leftTextColor = Color.WHITE,
                        rightTextColor = Color.WHITE
                    )
                    .setButtonColor(
                        yesColorId = Color.BLUE,
                        noColorId = Color.RED)
                    .setText(
                        text = "Ini contoh CENTER text",
                        textColor = Color.WHITE
                    )
                    .setBackgroundColor(Color.DKGRAY)
                    .build(
                        this,
                        onYesBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol YES diklik")
                            toast.setToastType(ToastType.SUCCESS)

                            toast.build().show()
                        },
                        onNoBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol NO diklik")
                            toast.setToastType(ToastType.WARNING)

                            toast.build().show()
                        })

            dialog.show()
        }

        binding.btnBottomDialog.setOnClickListener {
            val dialog =
                RaionDialog
                    .Confirmation()
                    .setType(DialogType.BOTTOM)
                    .setButtonText(
                        leftText = "KIRI",
                        rightText = "KANAN",
                        leftTextColor = Color.WHITE,
                        rightTextColor = Color.WHITE
                    )
                    .setButtonColor(
                        yesColorId = Color.BLUE,
                        noColorId = Color.RED)
                    .setText(
                        text = "Ini contoh TOP text",
                        textColor = Color.WHITE
                    )
                    .setBackgroundColor(Color.DKGRAY)
                    .build(
                        this,
                        onYesBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol YES diklik")
                            toast.setToastType(ToastType.SUCCESS)

                            toast.build().show()
                        },
                        onNoBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol NO diklik")
                            toast.setToastType(ToastType.WARNING)

                            toast.build().show()
                        })

            dialog.show()
        }
    }
}