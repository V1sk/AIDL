// MessageReceiver.aidl
package com.example.aidl;
import com.example.aidl.data.MessageModel;

interface MessageReceiver {
    void onMessageReceived(in MessageModel receivedMessage);
}
