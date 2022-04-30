package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun incremenet(view: View) {
        ++count
        val countText = findViewById<TextView>(R.id.countText)
        countText.text = count.toString()
    }

    fun decremenet(view: View) {
        if(count <= 0) return
        --count
        val countText = findViewById<TextView>(R.id.countText)
        countText.text = count.toString()
    }
}