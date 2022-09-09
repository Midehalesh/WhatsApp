package com.example.whatsapp

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
        Message("Yemi Alesh", "08:00", "I'm on my way to your house"),
        Message("Yemi Alesh", "12:00", "Hello, hope work is going well"),
        Message("Yemi Alesh", "18:00", "Thank you"),
        Message("Yemi Alesh", "20:00", "I love you")
    )
}
