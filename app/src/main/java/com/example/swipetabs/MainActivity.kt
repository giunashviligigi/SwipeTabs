package com.example.swipetabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swipetabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment(),"First")
        adapter.addFragment(SecondFragment(),"Second")
        adapter.addFragment(ThirdFragment(),"Third")


        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)


    }
}