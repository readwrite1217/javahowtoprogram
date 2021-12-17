package Chapter3.HealthProfile;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile person1 = new HealthProfile("firstName", "Male", "lastName", 10, 02, 1996, 154.5, 69.6);
        System.out.printf("FirstName: %s\nLastName: %s\nGender: %s\nAge: %d\nHeight In Inches: %.2f\nWeight In lbs: %.2f\nBMI: %.2f\nMaximum Heart Rate: %d\nTarget Heart Rate: %s\n", person1.getFirstName(), person1.getLastName(), person1.getGender(), person1.age(), person1.getHeightInInches(), person1.getWeightInLbs(), person1.getBMI(), person1.getMaxHeartRate(), person1.getTargetHeartRate());
    }
}
