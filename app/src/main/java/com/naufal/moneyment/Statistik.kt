package com.naufal.moneyment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.naufal.moneyment.databinding.ActivityProfileBinding
import com.naufal.moneyment.databinding.ActivityStatistikBinding

class Statistik : AppCompatActivity() {
    private lateinit var binding: ActivityStatistikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatistikBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_statistik)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val secondFragment=SecondFragment()
        val fourthFragment=FourthFragment()

        setCurrentFragment(fourthFragment)
        binding.bottomNavigationView.selectedItemId = R.id.analyst
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                }
                R.id.note -> setCurrentFragment(secondFragment)
                R.id.add -> {
                    val intent = Intent(this, Catat::class.java)
                    startActivity(intent)
                }
                R.id.analyst -> setCurrentFragment(fourthFragment)
                R.id.user -> {
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                }
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}