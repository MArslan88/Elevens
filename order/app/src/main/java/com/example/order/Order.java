package com.example.order;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Order extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
