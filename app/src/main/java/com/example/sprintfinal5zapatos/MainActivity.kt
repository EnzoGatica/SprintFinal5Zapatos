package com.example.sprintfinal5zapatos

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprintfinal5zapatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mSharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSharedPreferences = getSharedPreferences("llave", Context.MODE_PRIVATE)
        val binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}