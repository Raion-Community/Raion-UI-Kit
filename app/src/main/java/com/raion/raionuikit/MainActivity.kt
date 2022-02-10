package com.raion.raionuikit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.raion.raiontoast.RaionToast
import com.raion.raiontoast.util.ToastType

class MainActivity : AppCompatActivity() {

    private lateinit var mainButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 0

        mainButton = findViewById<Button?>(R.id.btnMain)
            .apply {
                setOnClickListener {
                    val toast = RaionToast.getToastBuilder(this@MainActivity)
                        .setText("Halo bang ini toast")
                    when(i) {
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
            }
    }
}