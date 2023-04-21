package com.jaytala.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaytala.money.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main2)

    }
}