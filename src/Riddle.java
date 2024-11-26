import java.util.Random;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100);
        int playerNumber = 0;
        int totalTries = 0;

        String welcomeText = """
                Welcome to the Riddle game!
                I have chosen one number from 1 to 100.
                
                Your challenge here is to guess what number I have chosen, 
                you will have 5 attempts and for each attempt I will tell 
                you how close to the number you are.
                """;
        System.out.println(welcomeText);


        String lose = """
                You died... now go away and play some minecraft.
                """;
        String win = """
                Congratulations! You win! I knew you could do it!
                """;
        String higherNumber = """
                Listen carefully to the tip: The number you chose is higher than the number I have chosen.
                """;
        String lowerNumber = """
                Listen carefully to the tip: The number you chose is lower than the number I have chosen.
                """;
        while (playerNumber != randomNumber) {
            String message = message(totalTries);

            if (totalTries > 4) {
                System.out.println(lose);
                break;
            }

            System.out.println(message);
            if (totalTries > 0 ) {
                if (playerNumber > randomNumber) {
                    System.out.println(higherNumber);
                } else {
                    System.out.println(lowerNumber);
                }
            }
            playerNumber = sc.nextInt();

            if (playerNumber < 0 || playerNumber > 100) {
                System.out.println("Let's be clear, just write a number between 0 and 100. Fine? start again");
                break;
            }

            if (playerNumber == randomNumber) {
                System.out.println(win);
                break;
            } else {
                totalTries++;
            }
        }
    }
    public static String message(int totalTries) {
        String firstAttemptText = """
                Tell me, what is your first attempt?
                """;
        String secondAttemptText = """
                Well you did not get it in the first try, but let's move on. What is your second attempt?
                """;
        String thirdAttemptText = """
                I'm starting to think that you are not good at this, but let's move on. What is your third attempt?
                """;
        String fourthAttemptText = """
                Jezz.. why did you even started the game?, anyway... What is your fourth attempt?
                """;
        String fifthAttemptText = """
                Alright, I'm done wasting my time, this is your last chance. What is your last attempt?
                """;
        return switch (totalTries) {
            case 1 -> secondAttemptText;
            case 2 -> thirdAttemptText;
            case 3 -> fourthAttemptText;
            case 4 -> fifthAttemptText;
            default -> firstAttemptText;
        };
    }
}
