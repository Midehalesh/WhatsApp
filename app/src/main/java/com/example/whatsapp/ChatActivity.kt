package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var messageRv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val username: String = intent.getStringExtra("USER") ?:""

//        This is to show the chat conversation
        messageRv = findViewById(R.id.messageSection)
        messageRv.layoutManager = LinearLayoutManager(this)

        setupToolbar(username)
    }

    private fun setupToolbar(username: String) {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = username
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}