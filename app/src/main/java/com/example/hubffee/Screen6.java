package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Screen6 extends AppCompatActivity {
    private Settings settings;
    private int totalHours;
    private int usedHours;
    private int remainingHours;
    private int differenceHours;
    TextView viewTotalHours;
    TextView viewUsedHours;
    TextView viewRemainingHours;
    TextView viewDifferenceHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Setting the App Theme
        settings = new Settings(this);
        //        setting the theme
        settings.settingAppTheme();
        //      setting the layout
        setContentView(R.layout.activity_screen6);

        configuringScreen();
        totalHours = 90;
        usedHours = 50;
        remainingHours = 40;
        differenceHours = 0;
        configuringHours(totalHours,usedHours,remainingHours,differenceHours);
    }

    private void configuringHours(int totalHours,int usedHours,int remainingHours,
                                  int differenceHours) {
        viewTotalHours.setText(Integer.toString(totalHours));
        viewUsedHours.setText(Integer.toString(usedHours));
        viewRemainingHours.setText(Integer.toString(remainingHours));
        viewDifferenceHours.setText(Integer.toString(differenceHours));
    }

    private void configuringScreen() {
        GradientDrawable packageCircle;

        viewTotalHours = findViewById(R.id.total_hours);
        viewTotalHours.setTextColor(getResources().getColor(R.color.color_3_Primary_Text));
        packageCircle = (GradientDrawable) viewTotalHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_3_Primary));

        viewUsedHours = findViewById(R.id.used_hours);
        viewUsedHours.setTextColor(getResources().getColor(R.color.color_4_Primary_Text));
        packageCircle = (GradientDrawable) viewUsedHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_4_Primary));

        viewRemainingHours = findViewById(R.id.remaining_hours);
        viewRemainingHours.setTextColor(getResources().getColor(R.color.color_5_Primary_Text));
        packageCircle = (GradientDrawable) viewRemainingHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_5_Primary));

        viewDifferenceHours = findViewById(R.id.difference_hours);
        viewDifferenceHours.setTextColor(getResources().getColor(R.color.color_1_Primary_Text));
        packageCircle = (GradientDrawable) viewDifferenceHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_1_Primary));



    }

    public void lessHours(View view) {
        if (differenceHours>0){
            differenceHours = differenceHours-1;
            usedHours = usedHours - 1;
            remainingHours = remainingHours + 1;
            configuringHours(totalHours,usedHours,remainingHours,differenceHours);
        }
        else{
            Toast.makeText(this,"No se puede reducir horas",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void moreHours(View view) {
        if (remainingHours > 0){
            differenceHours = differenceHours+1;
            usedHours = usedHours + 1;
            remainingHours = remainingHours - 1;
            configuringHours(totalHours,usedHours,remainingHours,differenceHours);
        }
        else
        {
            Toast.makeText(this,"No hay más horas dispobibles",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
