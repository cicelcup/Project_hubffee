package com.example.hubffee;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

//Class to set the theme of the activity
public class Settings {
    //SharedPreferences where it is stored the theme value
    private SharedPreferences myPreference;
    private int theme;

//    Context of the activity that is calling the class
    private Context context;

    public Settings(Context context) {
        this.context = context;
    }

//    Theme defined for the app
    public void setTheme(int theme) {
        this.theme = theme;
    }

    public int getTheme() {
        return theme;
    }


    public void settingAppTheme() {
        myPreference = context.getSharedPreferences("theme",0);
        theme = myPreference.getInt("theme",1);

        switch (theme){
            case 1:
                context.setTheme(R.style.AppTheme);
                break;
            case 2:
                context.setTheme(R.style.AppTheme_2);
                break;
            case 3:
                context.setTheme(R.style.AppTheme_3);
                break;
            case 4:
                context.setTheme(R.style.AppTheme_4);
                break;
            case 5:
                context.setTheme(R.style.AppTheme_5);
                break;
        }
    }
//  Changing the theme of the activity

    public void changingAppTheme() {
        Activity activity = (Activity)context;
        SharedPreferences.Editor editor = myPreference.edit();
        editor.putInt("theme",theme);
        editor.commit();
        activity.recreate();
    }
}
