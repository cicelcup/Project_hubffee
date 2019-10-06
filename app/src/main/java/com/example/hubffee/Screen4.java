package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Screen4 extends AppCompatActivity {
    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Setting the App Theme
        settings = new Settings(this);
        //        setting the theme
        settings.settingAppTheme();
        //      setting the layout
        setContentView(R.layout.activity_screen4);
    }
}
