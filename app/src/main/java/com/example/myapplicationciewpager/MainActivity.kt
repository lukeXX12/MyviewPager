package com.example.myapplicationciewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager : ViewPager2
    private lateinit var tabBar : TabLayout
    private lateinit var  viewPagerFragmentAdapter: ViewPagerFragmentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.ViewPager2)
        tabBar = findViewById(R.id.TabBar)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        viewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator( tabBar, viewPager){tab, position->
            tab.text="tab${position+1}"
        }.attach()


    }
}