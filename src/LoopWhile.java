import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner readingWhile = new Scanner(System.in);
        System.out.println("Rate the movie ");
        double mediaRating = 0;
        double rating = 0;
        int counter = 0;

        while (rating != -1) {
            System.out.println("Enter the movie rating or -1 to exit: ");
            rating = readingWhile.nextDouble();

            if (rating != -1) {
                mediaRating += rating;
                counter++;
            }
        }

        System.out.println("Movie rating: " + mediaRating / counter);
    }
}
