package com.example.kotlinwebview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            val url=Intent(android.content.Intent.ACTION_VIEW);
            url.data= Uri.parse("https://www.google.com/")
                startActivity(url)
        }
        b2.setOnClickListener {
            val url=Intent(android.content.Intent.ACTION_VIEW)
            url.data= Uri.parse("https://www.tutorialspoint.com/hadoop/index.htm")
            startActivity(url)
        }
    }
}
