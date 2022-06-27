package com.example.attributes_73

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.attributes_73.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonYellow.setOnClickListener {
            bindingClass.edText.setBackgroundColor(Color.YELLOW)
        }
        bindingClass.buttonWhite.setOnClickListener {
            bindingClass.edText.setBackgroundColor(Color.WHITE)
        }
        bindingClass.buttonRed.setOnClickListener {
            bindingClass.edText.setTextColor(Color.RED)
        }
        bindingClass.buttonBlack.setOnClickListener {
            bindingClass.edText.setTextColor(Color.BLACK)
        }
          bindingClass.button20.setOnClickListener {
           bindingClass.edText.setTextSize(20F)
      }
       bindingClass.button40.setOnClickListener {
           bindingClass.edText.setTextSize(40F)
        }
    }

}

