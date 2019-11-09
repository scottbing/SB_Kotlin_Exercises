package com.android.sb_kotlin_dynamic_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout

        // creating the button
        val button_dynamic = Button(this)
        // setting layout_width and layout_height using layout parameters
        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        button_dynamic.text = "Dynamic Button"
        // add Button to LinearLayout
        ll_main.addView(button_dynamic)

    }
}
