package com.example.tasbhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.setText("Hello shohan")

         var button = findViewById<Button>(R.id.button2)

        var button1 = findViewById<Button>(R.id.button)
        var button3 = findViewById<Button>(R.id.button3)

    button.setOnClickListener {
        count++

        textView.setText(count.toString())
    }
        button1.setOnClickListener {
            count = 0

            textView.setText(count.toString())
        }
        button3.setOnClickListener {
            count--
            textView.setText(count.toString())
        }
    }
}