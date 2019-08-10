package net.osdn.gokigen.gps.adapter;

import android.location.Location;

/**
 *   GPSの位置情報を通知する
 *
 */
public interface IGpsLocationNotify
{
    void gpsLocationUpdate(long timestamp, Location location, String nmeaLocation);
    void gpsLocationFixed();
}
