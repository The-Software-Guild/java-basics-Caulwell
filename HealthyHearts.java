package beginner.Assessment;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("What is your age?");

        int age = s.nextInt();

        int maxHR = 220-age;
        double targetHRLow = maxHR*0.5;
        double targetHRHigh = maxHR*0.85;

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute");
        System.out.println("Your target HR Zone is " + (int)targetHRLow + " - " + (int)targetHRHigh + " beats per minute");
    }
}
