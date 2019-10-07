package com.example.hubffee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Screen3 extends AppCompatActivity {
    private Settings settings;
    private TextView viewTotalHours;
    private TextView viewUsedHours;
    private TextView viewRemainingHours;
    private TextView viewDifferenceHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Setting the App Theme
        settings = new Settings(this);
        //        setting the theme
        settings.settingAppTheme();
        //      setting the layout
        setContentView(R.layout.activity_screen3);
        configuringScreen();
    }

    //creating the option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Menu main is a layout created
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    //open the menu selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //Check if setting was pressed
        if (id == R.id.actions_settings) {
            EditText nameEdition = findViewById(R.id.name_edition);
            nameEdition.setEnabled(true);

            EditText lastNameEdition = findViewById(R.id.last_name_edition);
            lastNameEdition.setEnabled(true);

            EditText idEdition = findViewById(R.id.id_edition);
            idEdition.setEnabled(true);

            EditText emailEdition= findViewById(R.id.email_edition);
            emailEdition.setEnabled(true);

            EditText phoneEdition = findViewById(R.id.phone_edition);
            phoneEdition.setEnabled(true);

            RadioButton basicEdition = findViewById(R.id.basic_edition);
            basicEdition.setEnabled(true);

            RadioButton premiumEdition = findViewById(R.id.premium_edition);
            premiumEdition.setEnabled(true);

            RadioButton emprendeEdition = findViewById(R.id.emprende_edition);
            emprendeEdition.setEnabled(true);

            Button saveEdition = findViewById(R.id.save_edition);
            saveEdition.setEnabled(true);

        }
        return super.onOptionsItemSelected(item);
    }

    private void configuringScreen() {
        GradientDrawable packageCircle;

        viewTotalHours = findViewById(R.id.total_hours_2);
        viewTotalHours.setTextColor(getResources().getColor(R.color.color_3_Primary_Text));
        packageCircle = (GradientDrawable) viewTotalHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_3_Primary));

        viewUsedHours = findViewById(R.id.used_hours_2);
        viewUsedHours.setTextColor(getResources().getColor(R.color.color_4_Primary_Text));
        packageCircle = (GradientDrawable) viewUsedHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_4_Primary));

        viewRemainingHours = findViewById(R.id.remaining_hours_2);
        viewRemainingHours.setTextColor(getResources().getColor(R.color.color_5_Primary_Text));
        packageCircle = (GradientDrawable) viewRemainingHours.getBackground();
        packageCircle.setColor(getResources().getColor(R.color.color_5_Primary));

    }

    public void cofirmSave(View view) {
        Toast.makeText(this,"Salvando información del cliente",Toast.LENGTH_SHORT).show();
    }
}
