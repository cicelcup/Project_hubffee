package com.example.hubffee;

import java.util.Date;

public class Package {
    private String packageType;
    private int hoursTotal;
    private Date mDate;
    private int hoursRemaining;

    public Package(String packageType, int hoursTotal, Date mDate, int hoursRemaining) {
        this.packageType = packageType;
        this.hoursTotal = hoursTotal;
        this.mDate = mDate;
        this.hoursRemaining = hoursRemaining;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getHoursTotal() {
        return hoursTotal;
    }

    public Date getmDate() {
        return mDate;
    }

    public int getHoursRemaining() {
        return hoursRemaining;
    }
}





