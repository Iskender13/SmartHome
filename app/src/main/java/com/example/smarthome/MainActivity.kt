package com.example.smarthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.smarthome.fragments.cameraFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabs: TabLayout = findViewById(R.id.tab_layout)
    val viewPager: ViewPager2 = findViewById(R.id.view_pager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPagerAdapter=ViewPagerAdapter(this)
        viewPager.adapter=viewPagerAdapter
        TabLayoutMediator(tabs, viewPager){tab, position->
            tab.text= when(position){
                0->"Cameras"
                1->"Doors"
                else->null
            }
        }.attach()
    }
}
