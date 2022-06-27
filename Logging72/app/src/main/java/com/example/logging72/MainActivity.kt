package com.example.logging72

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityViewCommand
import org.w3c.dom.Text
import timber.log.Timber
import timber.log.Timber.Forest.plant


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("FromEditText","hochu_soobcenie" )
        val buttonL: Button = findViewById(R.id.button_log)
        buttonL.setOnClickListener {

            val Ed:EditText = findViewById(R.id.ed_text)
            val showString = Ed.text.toString()

            Log.v("FromEditText", showString)


        }
        val buttonT: Button = findViewById(R.id.button_timber)
        buttonT.setOnClickListener {
            val Ed:EditText = findViewById(R.id.ed_text)
            val showString = Ed.text.toString()
            Timber.v(showString)
            }
        }
    }
