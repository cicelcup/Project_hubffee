package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Screen5 extends AppCompatActivity {
    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Setting the App Theme
        settings = new Settings(this);
        //        setting the theme
        settings.settingAppTheme();
        //      setting the layout
        setContentView(R.layout.activity_screen5);

        FloatingActionButton add = findViewById(R.id.floatingActionButtonPackage);
        settings.choosingAdd(add);

        addingListView();
    }

    private void addingListView() {
        ArrayList<PackageHour> packagesOfClient = new ArrayList<PackageHour>();

        packagesOfClient.add(new PackageHour(
                1,"Basico",30,"07-09-2019",0)
        );
        packagesOfClient.add(new PackageHour(
                2,"Premium",60,"10-09-2019",0)
        );
        packagesOfClient.add(new PackageHour(
                3,"Basico",30,"12-09-2019",0)
        );
        packagesOfClient.add(new PackageHour(
                4,"Emprende",90,"18-09-2019",0)
        );
        packagesOfClient.add(new PackageHour(
                5,"Basico",30,"25-09-2019",0)
        );
        packagesOfClient.add(new PackageHour(
                6,"Premium",90,"30-09-2019",15)
        );

        HoursAdapter hoursAdapter = new HoursAdapter(this, packagesOfClient);


        ListView listView = (ListView)findViewById(R.id.package_list);

        listView.setAdapter(hoursAdapter);
    }

}
