package com.example.smarthome

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.smarthome.fragments.cameraFragment
import com.example.smarthome.fragments.doorsFragment

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
    private val fragments= arrayOf(cameraFragment(), doorsFragment())

    override fun getItemCount(): Int =fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}