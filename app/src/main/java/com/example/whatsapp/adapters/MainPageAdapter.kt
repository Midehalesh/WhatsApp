package com.example.whatsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsapp.fragment.CallFragment
import com.example.whatsapp.fragment.CameraFragment
import com.example.whatsapp.fragment.ChatFragment
import com.example.whatsapp.fragment.StatusFragment

class MainPageAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> return CameraFragment()
            1 -> return ChatFragment()
            2 -> return StatusFragment()
            3 -> return CallFragment()
            else -> ChatFragment()
        }

    }
}