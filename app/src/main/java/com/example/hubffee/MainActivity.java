package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  SharedPreferences myPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myPreference = getPreferences(MODE_PRIVATE);
        int theme = myPreference.getInt("theme",1);

        if (theme == 1){
            setTheme(R.style.AppTheme);
        }
        else
        {
            setTheme(R.style.AppTheme_2);
        }

        setContentView(R.layout.activity_main);
    }

    public void openScreen(View view) {
        SharedPreferences.Editor editor = myPreference.edit();
        editor.putInt("theme",2);
        editor.commit();
        recreate();
    }
}
