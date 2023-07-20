package com.example.listviewselfprojects

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RatingActivity : AppCompatActivity() {
    lateinit var dialog:Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)


        dialog = Dialog(this)
        dialog.setContentView(R.layout.customlayout)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.prompt))


        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnClose = dialog.findViewById<Button>(R.id.buttonCLose)


        btnClose.setOnClickListener {
            dialog.dismiss()
        }

        btnSubmit.setOnClickListener {
            Toast.makeText(this, "Thanks", Toast.LENGTH_SHORT).show()
            dialog.show()
        }
    }
}