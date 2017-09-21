package lentohorisontti;

public class TimeFormat {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // set a new time value using universal time; perform
    // validity checks on the data; set invalid values to zero
    public void setTime(double sekunnit) {
        int h;
        int m;
        int s;

        if (sekunnit >= 3600.) {
            h = (int) (Math.round(sekunnit / 60. / 60.));
        } else {
            h = 0;
        }

        if ((sekunnit - h / 60. / 60.) >= 60) {
            m = (int) Math.round(sekunnit / 60. - h * 60.);
        } else {
            m = 0;
        }
        s = (int) Math.round(sekunnit - h * 60. * 60. - m * 60.);

        hour = ((h >= 0 && h < 24) ? h : 0); // validate hour
        minute = ((m >= 0 && m < 60) ? m : 0); // validate minute
        second = ((s >= 0 && s < 60) ? s : 0); // validate second

    } // end method setTime

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    } // end method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    } // end method toString
} // end class Time1
