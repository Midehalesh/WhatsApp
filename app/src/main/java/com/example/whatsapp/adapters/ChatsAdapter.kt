package com.example.whatsapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.SampleChats
import com.example.whatsapp.model.Chats
import com.example.whatsapp.model.Message

//This adapter is responsible for showing the chats between the sender and the receiver
class ChatsAdapter(val context: Context, userName: String): RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder>() {
//    This lines are responsible for initializing the list of chat btw the sender and receiver
    val sampleChats = SampleChats()
    val chat: Chats? = sampleChats.getChatsOf(userName)
    val listOfMessages: List<Message> = chat!!.messages

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.chats_layout, parent, false)

        return ChatsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {
        val message: Message = listOfMessages[position]
//        This is responsible for the position of the message
        if (message.sender == "me"){
            holder.messageSent.text = message.message
            holder.msgSentTime.text = message.time

            holder.leftSection.visibility = View.GONE
        }else{
            holder.senderMessage.text = message.message
            holder.timeOfSenderMessage.text = message.time

            holder.rightSection.visibility = View.GONE

        }
    }

    override fun getItemCount(): Int {
        return listOfMessages.size
    }

    class ChatsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val senderMessage: TextView = itemView.findViewById(R.id.senderMessage)
        val timeOfSenderMessage: TextView = itemView.findViewById(R.id.timeOfSenderMessage)
        val messageSent: TextView = itemView.findViewById(R.id.messageSent)
        val msgSentTime: TextView = itemView.findViewById(R.id.msgSentTime)

        val leftSection: CardView = itemView.findViewById(R.id.senderSection)
        val rightSection: CardView = itemView.findViewById(R.id.UserSection)
    }

}