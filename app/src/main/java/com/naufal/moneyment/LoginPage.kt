package com.naufal.moneyment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        Glide.with(this).load("https://i.imgur.com/1MFzp8.png").into(findViewById(R.id.rlpssttzqy08))
        Glide.with(this).load("https://i.imgur.com/1MFzp8.png").into(findViewById(R.id.rhpsjwvmn27a))
    }
}