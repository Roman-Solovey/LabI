package com.example.l82

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val eT = findViewById<View>(R.id.et) as EditText
        val vT = findViewById<View>(R.id.tv) as TextView
        val cB = findViewById<Button>(R.id.cB) as CheckBox
        val pB = findViewById<View>(R.id.pb) as ProgressBar
        button.setOnClickListener {
            if(cB.isChecked){
                vT.text = eT.text.toString()
                pB.progress += 10
                if(pB.progress ==100) pB.progress =0


            }
        }
    }
}