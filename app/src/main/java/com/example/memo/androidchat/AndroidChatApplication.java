package com.example.memo.androidchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Memo on 25/06/2016.
 * Clase que Inicializara FareBase y ademas se agrega en Manifest la clase y se le da permiso para
 * acceso a Internet
 */
public class AndroidChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        //Indicamos que queremos que pueda trabajar Offile
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
