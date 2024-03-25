package com.example.esmianprojek

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnsendto)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Implisit Intent
        val url ="tel:085211010418"
        val implicitBtnShare =findViewById<Button>(R.id.btnsendto)

        implicitBtnShare.setOnClickListener{
            val implicitIntentnt=Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(implicitIntentnt)
        }
    }
}


