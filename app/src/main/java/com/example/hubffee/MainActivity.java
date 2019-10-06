package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

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
        settingRadioButton();
    }

    private void settingRadioButton(){
        switch (theme){
            case 1:
                RadioButton r1 = (RadioButton)findViewById(R.id.radioButton1);
                r1.setChecked(true);
                break;
            case 2:
                RadioButton r2 = (RadioButton)findViewById(R.id.radioButton2);
                r2.setChecked(true);
                break;
            case 3:
                RadioButton r3 = (RadioButton)findViewById(R.id.radioButton3);
                r3.setChecked(true);
                break;
            case 4:
                RadioButton r4 = (RadioButton)findViewById(R.id.radioButton4);
                r4.setChecked(true);
                break;
            case 5:
                RadioButton r5 = (RadioButton)findViewById(R.id.radioButton5);
                r5.setChecked(true);
                break;
        }
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
        Intent intent = new Intent(this,Screen1.class);
        startActivity(intent);
    }

//    function to change the app theme
    private void changingAppTheme() {
        SharedPreferences.Editor editor = myPreference.edit();
        editor.putInt("theme",theme);
        editor.commit();
        recreate();
    }

    public void choosingTheme(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    theme = 1;
                    break;
            case R.id.radioButton2:
                if (checked)
                    theme = 2;
                    break;
            case R.id.radioButton3:
                if (checked)
                    theme = 3;
                    break;
            case R.id.radioButton4:
                if (checked)
                    theme = 4;
                    break;
            case R.id.radioButton5:
                if (checked)
                    theme = 5;
                    break;
        }
        changingAppTheme();
    }
}
