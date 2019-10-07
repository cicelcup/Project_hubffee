package com.example.hubffee;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

//Adapter to load the information
public class HoursAdapter extends ArrayAdapter<PackageHour> {

    //Constructor for the earthquake
    HoursAdapter(Context context, List<PackageHour> packageHoursList) {
        super(context, 0, packageHoursList);
    }

    //get item of the adapter (recycling the view)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View currentView = convertView;

        if (currentView == null) {
            //if it's not created, inflate the layout
            currentView = LayoutInflater.from(getContext()).
                    inflate(R.layout.packages_hour, parent, false);
        }

        //get the current position from the adapter
        PackageHour packageHour= getItem(position);

        //Set the magnitude text
        TextView textItem = currentView.findViewById(R.id.item);
        textItem.setText(packageHour.getItem());

        //Circle behind the magnitude
        GradientDrawable packageCircle = (GradientDrawable) textItem.getBackground();

        //Check the color of the circle using the formatMagColor method
        packageCircle.setColor(formatMagColor(packageHour.getPackageType()));

        //set the place text using the formatLocation method
        TextView textViewPackageType = currentView.findViewById(R.id.package_type);
        textViewPackageType.setText(packageHour.getPackageType());

        TextView textViewPackageHours = currentView.findViewById(R.id.package_hours);
        textViewPackageHours.setText(packageHour.getHoursTotal());

        //set the date text using the formatDate method
        TextView textViewDate = currentView.findViewById(R.id.date);
        textViewDate.setText(packageHour.getmDate());

        //Set the time text using the formatTime method
        TextView textViewRemaining = currentView.findViewById(R.id.packages_remaining);
        textViewRemaining.setText(packageHour.getHoursRemaining());

        return currentView;
    }

    //color of background circle
    private int formatMagColor(String packageType) {
        //Check the magnitude and round to the low value
        int color;

        switch (packageType) {
            case "Basico":
                color = getContext().getResources().getColor(R.color.basico_color);
                break;
            case "Premium":
                color = getContext().getResources().getColor(R.color.premium_color);
                break;
            default:
                color = getContext().getResources().getColor(R.color.emprende_color);
                break;
        }
        return color;
    }
}

