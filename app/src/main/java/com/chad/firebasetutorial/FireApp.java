package com.chad.firebasetutorial;

import android.app.Application;
import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;


public class FireApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        /*
        //Older Version
        Firebase.setAndroidContext(this);
        */

        /*
        //For storage purposes we do not need this code unless your also using database
        //Newer Version
        if(!FirebaseApp.getApps(this).isEmpty()) {

            FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        }
*/
    }

}
