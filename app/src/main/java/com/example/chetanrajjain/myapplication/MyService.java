package com.example.chetanrajjain.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return Service.START_NOT_STICKY;

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void stopService(){
        stopSelf();
    }
}
