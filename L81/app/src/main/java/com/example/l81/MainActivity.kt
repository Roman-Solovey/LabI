package com.example.l81

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hT1 = findViewById<View>(R.id.ht_1) as TextView
        val hT2 = findViewById<View>(R.id.ht_2) as TextView
        val hT3 = findViewById<View>(R.id.ht_3) as TextView
        val vT1 = findViewById<View>(R.id.vt_1) as TextView
        val vT2 = findViewById<View>(R.id.vt_2) as TextView
        val vT3 = findViewById<View>(R.id.vt_3) as TextView
        val cT1 = findViewById<View>(R.id.ct_1) as TextView
        val cT2 = findViewById<View>(R.id.ct_2) as TextView
        val cT3 = findViewById<View>(R.id.ct_3) as TextView
        val button = findViewById<Button>(R.id.button)
        var count = 1
        button.setOnClickListener {

            count+=1
            when(count%3){
                0 ->{

                    hT1.text = ""
                    vT1.text = ""
                    cT1.text = ""
                    hT2.text = ""
                    vT2.text =""
                    cT2.text = ""
                    hT3.text = count.toString()
                    vT3.text =count.toString()
                    cT3.text = count.toString()
                }
                1 ->{
                    hT1.text = count.toString()
                    vT1.text =count.toString()
                    cT1.text = count.toString()
                    hT2.text = ""
                    vT2.text =""
                    cT2.text = ""
                    hT3.text = ""
                    vT3.text =""
                    cT3.text = ""
                }
                2 ->{
                    hT1.text = ""
                    vT1.text = ""
                    cT1.text = ""
                    hT2.text = count.toString()
                    vT2.text =count.toString()
                    cT2.text = count.toString()
                    hT3.text = ""
                    vT3.text =""
                    cT3.text = ""
                }
            }
        }
    }
}