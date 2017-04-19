// MessageSender.aidl
package com.example.aidl;
import com.example.aidl.data.MessageModel;

interface MessageSender {
    void sendMessage(in MessageModel messageModel);
}
