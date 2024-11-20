package com.naufal.moneyment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naufal.moneyment.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        binding.btnSignIn.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnSignUp.setOnClickListener{
            val intent= Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
    }

}