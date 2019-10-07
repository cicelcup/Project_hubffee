package com.example.hubffee;

import java.util.Date;

public class PackageHour {
    private int item;
    private String packageType;
    private int hoursTotal;
    private String mDate;
    private int hoursRemaining;

    public PackageHour(int item,String packageType, int hoursTotal, String mDate, int hoursRemaining) {
        this.item = item;
        this.packageType = packageType;
        this.hoursTotal = hoursTotal;
        this.mDate = mDate;
        this.hoursRemaining = hoursRemaining;
    }

    public int getItem() {
        return item;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getHoursTotal() {
        return hoursTotal;
    }

    public String getmDate() {
        return mDate;
    }

    public int getHoursRemaining() {
        return hoursRemaining;
    }
}





