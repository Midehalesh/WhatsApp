package com.example.whatsapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.ChatActivity
import com.example.whatsapp.R
import com.example.whatsapp.SampleMessages
import com.example.whatsapp.model.Message



class ListOfMessagesAdapter(val context: Context): RecyclerView.Adapter<ListOfMessagesAdapter.MsgViewHolder>() {
    private val sampleMessages = SampleMessages()
    private val listOfMessages: List<Message> = sampleMessages.LIST_OF_MESSAGES

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)

        return MsgViewHolder(itemView)
    }
//This is responsible for showing the messages on the list
    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
    val sender = listOfMessages[position].sender
    holder.username.text = sender
        holder.message.text = listOfMessages[position].message

        holder.itemView.setOnClickListener {
            val intent = Intent(context, ChatActivity::class.java)
            intent.putExtra("USER", sender)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = listOfMessages.size

    class MsgViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val username: TextView = itemView.findViewById(R.id.userName)
        val message: TextView = itemView.findViewById(R.id.status)

        val leftSection: CardView = itemView.findViewById(R.id.senderSection)
        val rightSection: CardView = itemView.findViewById(R.id.UserSection)
    }
}