package com.example.kerry.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Builder builder = new Builder.ApplePCBuilder();
        Director pcDirector = new Director(builder);


        pcDirector.construct(4, 2, "Mac OS X 10.9.1");
        Log.d("MainActivity", "Computer Info : " + builder.create().toString());

        
    }
}
