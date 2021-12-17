package Chapter3.HeartRates;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates person1 = new HeartRates("Some", "OldGuy", new Date(15, 01, 1991));
        System.out.printf("Name: %s %s\n", person1.getFirstName(), person1.getLastName());
        System.out.printf("Age: %s\n", person1.age());
        System.out.printf("Maximum heart Rate: %d\n", person1.getMaxHeartRate());
        System.out.printf("Target heart Rate Range: %s\n", person1.getTargetHeartRate());

//        System.out.printf("Target heart Rate Range: %d - %d\n", person1.getLowerTargetHearRate(), person1.getUpperTargetHeartRate());
        System.out.println();
        HeartRates person2 = new HeartRates("Some", "Kid", new Date(15, 02, 2021));
        System.out.printf("Name: %s %s\n", person2.getFirstName(), person2.getLastName());
        System.out.printf("Age: %s\n", person2.age());
        System.out.printf("Maximum heart Rate: %s\n", person2.getMaxHeartRate());
//        System.out.printf("Target heart Rate Range: %d - %d\n", person2.getLowerTargetHearRate(), person2.getUpperTargetHeartRate());
    }
}
