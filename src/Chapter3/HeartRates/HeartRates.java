package Chapter3.HeartRates;

import java.util.Calendar;

public class HeartRates {

    private String firstName;
    private String lastName;
    private Date date;
    private static final int MAX_HEART_RATE = 220;

    public HeartRates(String firstName, String lastName, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int age() {
        int birthYear = date.getYear();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - birthYear);
    }

    public int getMaxHeartRate() {
        return MAX_HEART_RATE - age();
    }

/*    public int getLowerTargetHearRate() {
        return (int) (0.5 * getMaxHeartRate());
    }

    public int getUpperTargetHeartRate() {
        return (int) (0.85 * getMaxHeartRate());
    }*/

    public String getTargetHeartRate() {
        return String.format("%.0f-%.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * .85);
    }

}
