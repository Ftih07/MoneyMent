package com.naufal.moneyment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rzf47lmsakr8))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rqknvq8s99b))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.ri2sem5959e))
        Glide.with(this).load("https://i.imgur.com/1tMFzp8.png").into(findViewById(R.id.rx2yvh409ryb))
    }
}