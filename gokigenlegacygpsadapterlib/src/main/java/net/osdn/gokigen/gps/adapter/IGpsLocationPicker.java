package net.osdn.gokigen.gps.adapter;

/**
 *
 *
 */
public interface IGpsLocationPicker
{
    boolean prepare(IGpsFeatureSwitch gpsFeature);
    void controlGps(boolean isStart);

    boolean hasGps();
    boolean isTracking();
    boolean isFixedLocation();
}
