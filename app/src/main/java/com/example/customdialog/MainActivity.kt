package com.example.customdialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_1.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            val dialog = alertDialog.create()
            val dialogView = layoutInflater.inflate(R.layout.item_1, null, false)
            dialog.setView(dialogView)

            dialogView.retry_button.setOnClickListener {
                Toast.makeText(this, "You clicked Retry", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialogView.cancel_button.setOnClickListener {
                Toast.makeText(this, "You clicked Cancel", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            dialog.show()
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
    }
}