public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int year = 2022;
        System.out.println("Release date: " + year);
        boolean includedOnPlan = false;
        double rating = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println("Rating: " + media);
        String sinopse;

        sinopse = """
                Adventure movie from the 80's
                
                Very good!
                
                Release year: 2022
                """;
        System.out.println(sinopse);

        double celsiusToFahrenheit = fromCelsiusToFahrenheit(20);

        System.out.println("The temperature in Fahrenheit: " + celsiusToFahrenheit + "F");;
    }
    public static double fromCelsiusToFahrenheit(double number) {
        return (number * 9 / 5) + 32;
    }
}