package Chapter3.HealthProfile;

import java.util.Calendar;

public class HealthProfile {

    private String firstName;
    private String gender;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private double weightInLbs;
    private double heightInInches;
    private static final int MAX_HEART_RATE = 220;

    public HealthProfile(String firstName, String gender, String lastName, int day, int month, int year, double weightInLbs, double heightInInches) {
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.weightInLbs = weightInLbs;
        this.heightInInches = heightInInches;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeightInLbs() {
        return weightInLbs;
    }

    public void setWeightInLbs(double weightInLbs) {
        this.weightInLbs = weightInLbs;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getTargetHeartRate() {
        return String.format("%.0f-%.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * .85);
    }

    public int getMaxHeartRate() {
        return MAX_HEART_RATE - age();
    }

    public int age() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public double getBMI() {
        return  (weightInLbs * 703) / (heightInInches * heightInInches);
    }

}