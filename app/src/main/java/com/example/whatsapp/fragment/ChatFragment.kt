package com.example.whatsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.adapters.ListOfMessagesAdapter
import com.example.whatsapp.R

class ChatFragment : Fragment() {
    private lateinit var chatRecycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        chatRecycler = view.findViewById(R.id.chatRecycler)

        chatRecycler.adapter = ListOfMessagesAdapter(requireContext())
        chatRecycler.layoutManager = LinearLayoutManager(requireContext())
    }
}