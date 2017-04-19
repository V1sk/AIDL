package com.example.aidl.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

import com.example.aidl.MessageSender;
import com.example.aidl.data.MessageModel;

public class MessageService extends Service {

    private static final String TAG = "MessageService";

    public MessageService() {
    }

    IBinder messageSender = new MessageSender.Stub() {

        @Override
        public void sendMessage(MessageModel messageModel) throws RemoteException {
            Log.e(TAG, "messageModel: " + messageModel.toString());
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            return super.onTransact(code, data, reply, flags);
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return messageSender;
    }


}
