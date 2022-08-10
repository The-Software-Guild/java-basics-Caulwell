package beginner.Assessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        String[] breeds = {"St.Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        int total = 0;
        int count = 0;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What is your dog's name?");

        String name = s.nextLine();

        System.out.println(name + " is:");

        while(total <= 100 && count<4){

            int percentage = r.nextInt(100 - total - (breeds.length -count)) + 1;
            System.out.println(percentage+ "% " + breeds[count]);
            total+=percentage;
            count++;
        }

        System.out.println(100-total + "% " + breeds[4]);
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");

    }
}
