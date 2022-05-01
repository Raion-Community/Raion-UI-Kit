package com.raion.raionuikit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.raiondialog.RaionDialog
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

        binding.btnTestDialog.setOnClickListener {
            val dialog =
                RaionDialog
                    .ConfirmationDialog()
                    .setButtonText(
                        leftText = "KIRI",
                        rightText = "KANAN",
                        leftTextColor = Color.WHITE,
                        rightTextColor = Color.WHITE
                    )
                    .setButtonColor(
                        leftId = Color.BLUE,
                        rightId = Color.RED)
                    .setText(
                        text = "Ini contoh custom text",
                        textColor = Color.WHITE
                        )
                    .setBackgroundColor(Color.DKGRAY)
                    .build(
                        this,
                        onLeftBtnClick = {
                            val toast = RaionToast.Builder()
                                .setContext(this@MainActivity)
                                .setText("Tombol YES diklik")
                            toast.setToastType(ToastType.SUCCESS)

                            toast.build().show()
                        },
                        onRightBtnClick = {
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