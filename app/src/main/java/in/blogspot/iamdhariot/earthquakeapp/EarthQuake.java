package in.blogspot.iamdhariot.earthquakeapp;

/**
 * Created by Dhariot on 16-May-18.
 */

public class EarthQuake {
    // for earth quake data
    private String mMegnitude;
    private String mLocation;
    private String mDate;

    public EarthQuake() {

    }

    public EarthQuake(String mMegnitude, String mLocation, String mDate) {
        this.mMegnitude = mMegnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getmMegnitude() {
        return mMegnitude;
    }

    public void setmMegnitude(String mMegnitude) {
        this.mMegnitude = mMegnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
