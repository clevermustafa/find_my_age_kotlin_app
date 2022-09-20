package com.example.find_my_age

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonGetAge.setOnClickListener() {
            val birthYear:Int = editTextPhone.text.toString().toInt();
            val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR);
            val myAge = currentYear - birthYear;
            textView2.text = "Your Age is $myAge";
        }
    }

}