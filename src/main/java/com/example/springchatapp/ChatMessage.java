package com.example.springchatapp;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
