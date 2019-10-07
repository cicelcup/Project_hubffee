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
    }

    private void addingListView() {
        ArrayList<PackageHour> packagesOfClient = new ArrayList<PackageHour>();

//        final QuakeAdapter adapter = new QuakeAdapter(this,
//                QuakeQuery.extractQuakes(jsonQuakes));


        ListView listView = (ListView)findViewById(R.id.package_list);

//        listView.setAdapter(itemsAdapter);
    }

}
