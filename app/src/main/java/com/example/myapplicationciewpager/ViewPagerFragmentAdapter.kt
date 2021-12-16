package com.example.myapplicationciewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 3
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> Fragment1()
            1-> Fragment2()
            2-> FragmentDavaleba()



            else -> Fragment1()

        }
        TODO("Not yet implemented")
    }

}