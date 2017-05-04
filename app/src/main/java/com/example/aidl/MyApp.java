package com.example.aidl;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;

import java.util.List;

/**
 * Created by chenjianwei on 2017/5/5.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("process name", getProcessName());
    }

    //取得进程名
    private String getProcessName() {
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningApps = am.getRunningAppProcesses();
        if (runningApps == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo procInfo : runningApps) {
            if (procInfo.pid == Process.myPid()) {
                return procInfo.processName;
            }
        }
        return null;
    }

}
