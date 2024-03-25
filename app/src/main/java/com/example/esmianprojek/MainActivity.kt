package com.example.esmianprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esmianprojek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {

            val intenthome = Intent(this, home::class.java)
            startActivity(intenthome)
        }
        binding.daftar.setOnClickListener {

            val intentregister = Intent(this, register::class.java)
            startActivity(intentregister)
        }
        binding.lupapassword.setOnClickListener {

            val intentubahkatasandi = Intent(this, password::class.java)
            startActivity(intentubahkatasandi)

        }


        }
}
