package com.example.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp.adapters.MainPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var tablayout: TabLayout
    private lateinit var viewpager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       toolbar= findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        InnitTabLayout()

    }

    private fun InnitTabLayout() {
        tablayout = findViewById(R.id.tab)

        viewpager = findViewById(R.id.viewpager)
        viewpager.adapter = MainPageAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tablayout, viewpager) { tab, position ->
            when (position) {
                0 -> tab.icon = getDrawable(R.drawable.ic_baseline_camera_alt_24)
                1 -> tab.text = "Chats"
                2 -> tab.text = "Status"
                3 -> tab.text = "Calls"
            }
        }.attach()

        viewpager.currentItem = 1
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.app_bar_search -> {
                Toast.makeText(this, "Search click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.new_group -> {
                goToNewGroupActivity()
                return true
            }
           R.id.new_broadcast -> {
               goToNewBroadcastActivity()
               return true
           }
            R.id.linked_device -> {
                goToLinkedDevice()
                return true
            }
            R.id.settings -> {
                goToSettings()
                return true
            }
            R.id.starred_messages -> {
                goToStarredMessages()
                return true
            }
            else -> {
                return false
            }
        }
    }
    private fun goToNewGroupActivity(){
        val i = Intent(this, NewGroupActivity::class.java)
        startActivity(i)

    }
    private fun goToNewBroadcastActivity(){
        val i = Intent(this, NewBroadcastActivity::class.java)
        startActivity(i)
    }
    private fun goToLinkedDevice(){
        val i = Intent(this, LinkedDeviceActivity::class.java)
        startActivity(i)
    }
    private fun goToSettings(){
        val i = Intent(this, SettingsActivity::class.java)
        startActivity(i)
    }
    private fun goToStarredMessages(){
        val i = Intent(this, StarredMessagesActivity::class.java)
        startActivity(i)
    }

}