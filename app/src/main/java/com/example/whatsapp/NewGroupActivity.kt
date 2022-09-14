package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.adapters.ListOfFriendsAdapter

class NewGroupActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var recyclerview: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group2)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
       supportActionBar?.setDisplayHomeAsUpEnabled(true)


        InnitRecyclerView()

    }

    private fun InnitRecyclerView() {
        recyclerview = findViewById(R.id.listOfFriends)
        recyclerview.adapter = ListOfFriendsAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)

        // this is a design
        val decor = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerview.addItemDecoration(decor)
    }
}