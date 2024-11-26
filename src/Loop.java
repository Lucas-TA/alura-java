import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner readingLoop = new Scanner(System.in);
        System.out.println("Rate the movie ");
        double mediaRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the movie rating: ");
            rating = readingLoop.nextDouble();
            mediaRating += rating;
        }

        System.out.println("Movie rating: " + mediaRating / 3);
    }
}
