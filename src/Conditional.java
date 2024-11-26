public class Conditional {
    public static void main(String[] args) {
        int year = 2022;
        boolean includedOnPlan = false;
        double rating = 8.1;
        String planType = "plus";

        if ( year > 2022 ) {
            System.out.println("Actual releases");
        } else {
            System.out.println("Old movies");
        }

        if ( includedOnPlan || planType.equals("plus") ) {
            System.out.println("Included on plan");
        } else {
            System.out.println("Not included on free account");
        }
    }
}
