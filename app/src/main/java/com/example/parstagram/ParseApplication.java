package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tmeTOTagCihsQF3tVw4J8LgzJMGvGvlugN51dts5")
                .clientKey("JOCx3Rq348ylC8Ow9vQz2RzLJx1GW1SMnx2MoB8K")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
