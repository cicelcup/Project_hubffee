package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
//    Variables to recall the setting of the theme
    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Setting the App Theme
        settings = new Settings(this);
//        setting the theme
        settings.settingAppTheme();
//      setting the layout
        setContentView(R.layout.activity_main);
//        setting the radiobutton
        settingRadioButton();
    }
//method to define the radio button
    private void settingRadioButton(){
        switch (settings.getTheme()){
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
//  Method to opening the different screens
    public void openScreen(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.button1:
                intent = new Intent(this,Screen1.class);
                break;
            case R.id.button2:
                intent = new Intent(this,Screen2.class);
                break;
            case R.id.button3:
                intent = new Intent(this,Screen3.class);
                break;
            case R.id.button4:
                intent = new Intent(this,Screen4.class);
                break;
            case R.id.button5:
                intent = new Intent(this,Screen5.class);
                break;
            default:
                intent = new Intent(this,Screen6.class);
                break;
        }

        startActivity(intent);
    }

//  choosing the differents views
    public void choosingTheme(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    settings.setTheme(1);
                    break;
            case R.id.radioButton2:
                if (checked)
                    settings.setTheme(2);
                    break;
            case R.id.radioButton3:
                if (checked)
                    settings.setTheme(3);
                    break;
            case R.id.radioButton4:
                if (checked)
                    settings.setTheme(4);
                    break;
            case R.id.radioButton5:
                if (checked)
                    settings.setTheme(5);
                    break;
        }
        settings.changingAppTheme();
    }
}
