package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by kristaps.jeskins on 4/28/2017.
 */

public class Earthquake {
    private double mag;
    private String loc;
    private String day;
    private String url;

   public Earthquake(double Magnitude, String Location, String Day, String Url){
       this.mag = Magnitude;
       this.loc = Location;
       this.day = Day;
       this.url = Url;
   }

    public String getLoc() {
        return loc;
    }

    public String getDay() {
        return day;
    }

    public double getMag() {
        return mag;
    }

    public String getUrl() {
        return url;
    }
}
