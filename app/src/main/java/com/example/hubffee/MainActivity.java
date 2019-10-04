package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    Variables to recall the last preference for the theme
    private  SharedPreferences myPreference;
    private int theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Setting the App Theme
        settingAppTheme();

        setContentView(R.layout.activity_main);
    }

//    Function to setting the App Theme
    private void settingAppTheme() {
        myPreference = getPreferences(MODE_PRIVATE);
        theme = myPreference.getInt("theme",1);

        switch (theme){
            case 1:
                setTheme(R.style.AppTheme);
                break;
            case 2:
                setTheme(R.style.AppTheme_2);
                break;
            case 3:
                setTheme(R.style.AppTheme_3);
                break;
            case 4:
                setTheme(R.style.AppTheme_4);
                break;
            case 5:
                setTheme(R.style.AppTheme_5);
                break;
        }
    }

    public void openScreen(View view) {
//        changing the app theme
        changingAppTheme();
    }

//    function to change the app theme
    private void changingAppTheme() {
        SharedPreferences.Editor editor = myPreference.edit();
        if (theme < 5){
            theme ++;
        }
        else{
            theme = 1;
        }

        editor.putInt("theme",theme);
        editor.commit();
        recreate();
    }

}
