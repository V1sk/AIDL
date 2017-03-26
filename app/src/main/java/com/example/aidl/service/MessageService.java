package com.example.aidl.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MessageService extends Service {

    public MessageService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
