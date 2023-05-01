package com.geektech.hw_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.hw_3_6.databinding.ActivityMainBinding
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
        setIndicator()
    }

    private fun initAdapter() {
        adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter
    }

    private fun setIndicator() {
        val indicator: CircleIndicator3 = binding.indicator
        val viewPager = binding.viewPager
        indicator.setViewPager(viewPager)
    }
}