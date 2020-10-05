package com.example.instagramapp;
import android.app.Application;


import com.parse.Parse;
import com.parse.ParseObject;

public class parseApplication extends Application {
    // Intitializes Parse SDK as soon as the application is created
    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CF8pGfzVQxqMgSKyEWvsSxzViEXVAwpTuOKhFfyG")
                .clientKey("OIUkoKiTNJPcWi9un5QMgpf0ZWKSRZPeMW6kr9VL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
