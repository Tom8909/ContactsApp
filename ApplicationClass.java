package com.example.tom.contactsapplication;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application
{

    public static final String APPLICATION_ID = "256E2795-026A-C697-FFF9-7EF8F352DD00";
    public static final String API_KEY = "C182F702-B875-7B5A-FFE8-8095DB2D7C00";
    public static final String SERVER_URL = "https://api.backendless.com";


    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),
                APPLICATION_ID,
                API_KEY);
    }
}
