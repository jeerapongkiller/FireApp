package com.example.fire.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by monze on 7/15/2017.
 */
public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
