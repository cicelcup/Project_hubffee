package com.example.hubffee;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class HoursAdapter extends ArrayAdapter<PackageHour> {

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

        PackageHour packageHour= getItem(position);

        TextView textItem = currentView.findViewById(R.id.total_hours);
        textItem.setText(Integer.toString(packageHour.getItem()));

        GradientDrawable packageCircle = (GradientDrawable) textItem.getBackground();

        packageCircle.setColor(formatMagColor(packageHour.getPackageType()));

        TextView textViewPackageType = currentView.findViewById(R.id.package_type);
        textViewPackageType.setText(packageHour.getPackageType());

        TextView textViewPackageHours = currentView.findViewById(R.id.package_hours);
        textViewPackageHours.setText(Integer.toString(packageHour.getHoursTotal()));

        TextView textViewDate = currentView.findViewById(R.id.date);
        textViewDate.setText(packageHour.getmDate());

        TextView textViewRemaining = currentView.findViewById(R.id.packages_remaining);
        textViewRemaining.setText(Integer.toString(packageHour.getHoursRemaining()));

        return currentView;
    }

    //color of background circle
    private int formatMagColor(String packageType) {
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

