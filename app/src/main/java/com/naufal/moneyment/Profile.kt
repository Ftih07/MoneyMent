package com.naufal.moneyment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.naufal.moneyment.databinding.ActivityHomeBinding
import com.naufal.moneyment.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val secondFragment=SecondFragment()
        val fifthFragment=FifthFragment()

        setCurrentFragment(fifthFragment)
        binding.bottomNavigationView.selectedItemId = R.id.user
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
                R.id.analyst -> {
                    val intent = Intent(this, Statistik::class.java)
                    startActivity(intent)
                }
                R.id.user -> setCurrentFragment(fifthFragment)
            }
            true
        }

        binding.aboutUs.setOnClickListener(){
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        binding.logoutbtn.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }

    }
    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}