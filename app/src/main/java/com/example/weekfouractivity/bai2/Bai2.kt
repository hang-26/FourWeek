package com.example.weekfouractivity.bai2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.weekfouractivity.R
import com.example.weekfouractivity.bai2.fragment.HomeFragment
import com.example.weekfouractivity.bai2.fragment.ProfleFragment
import com.example.weekfouractivity.bai2.fragment.SettingFragment
import com.example.weekfouractivity.databinding.ActivityBai2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Bai2 : AppCompatActivity() {
    private lateinit var binding: ActivityBai2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(HomeFragment())
        binding.bottomNav.setOnItemReselectedListener {
            when(it.itemId){
                R.id.tab_home->{
                    loadFragment(HomeFragment())
                }
                R.id.tab_user->{
                    loadFragment(ProfleFragment())
                }
                R.id.tab_setting->{
                    loadFragment(SettingFragment())
                }
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

}