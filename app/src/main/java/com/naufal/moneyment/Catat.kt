package com.naufal.moneyment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.naufal.moneyment.databinding.ActivityCatatBinding
import com.naufal.moneyment.databinding.ActivityStatistikBinding

class Catat : AppCompatActivity() {
    private lateinit var binding: ActivityCatatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatatBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
//        setContentView(R.layout.activity_catat)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val secondFragment=SecondFragment()
        val thirdFragment=ThirdFragment()

        setCurrentFragment(thirdFragment)
        binding.bottomNavigationView.selectedItemId = R.id.add
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                }
                R.id.note -> setCurrentFragment(secondFragment)
                R.id.add -> setCurrentFragment(thirdFragment)
                R.id.analyst -> {
                    val intent = Intent(this, Statistik::class.java)
                    startActivity(intent)
                }
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