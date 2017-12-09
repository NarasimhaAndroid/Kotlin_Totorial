package com.androiddev.kotlin_demo.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.androiddev.kotlin_demo.Model.LoginModel
import com.androiddev.kotlin_demo.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.android_text)
        val login = LoginModel()
        login.email = "snarasimha8261@gmail.com"
        print(login.email)
        textView.text = login.email
        Log.d("Name", login.email)
    }
}
