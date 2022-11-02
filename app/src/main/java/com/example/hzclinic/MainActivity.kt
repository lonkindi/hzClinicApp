package com.example.hzclinic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }
    fun countMe (view: View){
        val countString = textView.text.toString()
        var count:Int = Integer.parseInt(countString)
        count++
        textView.text=count.toString()

    }
}