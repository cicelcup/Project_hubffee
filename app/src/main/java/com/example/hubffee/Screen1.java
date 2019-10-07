package com.example.hubffee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Screen1 extends AppCompatActivity {
    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Setting the App Theme
        settings = new Settings(this);
        //        setting the theme
        settings.settingAppTheme();
        //      setting the layout
        setContentView(R.layout.activity_screen1);

        FloatingActionButton add = findViewById(R.id.floatingActionButtonClients);
        settings.choosingAdd(add);
        addingListView();
    }

    private void addingListView() {
        ArrayList<String> clients = new ArrayList<String>();

        clients.add(getString(R.string.one));
        clients.add(getString(R.string.two));
        clients.add(getString(R.string.three));
        clients.add(getString(R.string.four));
        clients.add(getString(R.string.five));
        clients.add(getString(R.string.six));
        clients.add(getString(R.string.seven));
        clients.add(getString(R.string.eight));
        clients.add(getString(R.string.nine));
        clients.add(getString(R.string.ten));

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, clients);

        ListView listView = (ListView)findViewById(R.id.listOfClients);

        listView.setAdapter(itemsAdapter);
    }
}
