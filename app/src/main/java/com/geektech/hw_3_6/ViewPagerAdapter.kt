package com.geektech.hw_3_6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonFragment()
            1 -> PresentValueFragment()
            2 -> HistoryFragment()
            else -> ButtonFragment()
        }
    }
}