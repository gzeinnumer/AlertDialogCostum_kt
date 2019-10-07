package com.gzeinnumer.alertdialogcostumkt

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.dialog.*

class MainActivity : AppCompatActivity() {

    private var dialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dialog = Dialog(this)
        dialog?.setContentView(R.layout.dialog)
        dialog?.setTitle("Hay Zein")

        dialog?.text?.text = "Costum Dialog"
        dialog?.image?.setImageResource(R.mipmap.ic_launcher)

        dialog?.dialogButtonOK?.setOnClickListener{
            dialog?.dismiss()
        }
        dialog?.dialogButtonToast?.setOnClickListener{
            Toast.makeText(applicationContext, "Hay Zein", Toast.LENGTH_SHORT).show()
            dialog?.dismiss()
        }
        dialog?.show()
    }
}
