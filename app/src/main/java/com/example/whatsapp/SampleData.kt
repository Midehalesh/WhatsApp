package com.example.whatsapp

import com.example.whatsapp.model.Chats
import com.example.whatsapp.model.Message
import com.example.whatsapp.model.User

class SampleData {
    val LIST_OF_FRIENDS: List<User> = listOf(
        User("Sissy", "Hi bébé, I'm learning mobile app development"),
        User("Sissy", "Hi bébé, I'm learning mobile app development"),
        User("Sissy", "Hi bébé, I'm learning mobile app development"),
        User("Sissy", "Hi bébé, I'm learning mobile app development"),
    )
}
class SampleMessages {
    val LIST_OF_MESSAGES: List<Message> = listOf(
        Message("Debbie Chris", "08:00", "I'm on my way to your house", "me"),
        Message("Victory Ned", "12:00", "Hello, hope work is going well", "me"),
        Message("Muny Daniels", "18:00", "Thank you", "me"),
        Message("John Doe", "20:00", "I have received the mail", "me"),
        Message("Taylor Swift", "19:00", "You're the best", "me"),

    )
}
// This is responsible for the chat between the
class SampleChats{
    val LIST_OF_CHATS: List<Chats> = listOf(
        Chats("Debbie Chris", listOf(
            Message("me", "22:00", "Okay dear. see you soon", "Debbie Chris"),
            Message("Debbie Chris", "08:00", "I'm on my way to your house", "me")
        )),
        Chats("Victory Ned", listOf(
            Message("Victory Ned", "12:00", "Hello, hope work is going well", "me")
        )),
        Chats("Muny Daniels", listOf(
            Message("Muny Daniels", "18:00", "Thank you", "me")
        )),
        Chats("John Doe", listOf(
            Message("John Doe", "20:00", "I have received the mail", "me")
        )),
        Chats("Taylor Swift", listOf(
            Message("Taylor Swift", "19:00", "You're the best", "me")
        )),
        )
//    This function is responsible for filtering through the chat list
    fun getChatsOf(username: String): Chats?{
        for(item in LIST_OF_CHATS){
            if(item.sender == username){
                return item;
            }
        }
    return null
    }
}
