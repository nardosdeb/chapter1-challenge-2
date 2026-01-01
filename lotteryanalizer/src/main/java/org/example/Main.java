public class Chapter1_Challenge_1_2 {

    public static void main(String[] args) {

        // 1. Initialize winning numbers
        String[] winningNumbers = {
                "12-34-56-78-90",
                "33-44-11-66-22",
                "01-02-03-04-05"
        };

        double highestAverage = 0.0;
        String highestTicket = "";

        // Use for-each loop
        for (String ticket : winningNumbers) {

            System.out.println("Analyzing: " + ticket);

            // Remove dashes
            String digitsOnly = ticket.replace("-", "");

            // Convert to char array
            char[] chars = digitsOnly.toCharArray();

            int[] digits = new int[chars.length];
            int sum = 0;

            // Use for loop
            for (int i = 0; i < chars.length; i++) {
                digits[i] = Character.getNumericValue(chars[i]);
                sum += digits[i];
            }

            double average = (double) sum / digits.length;

            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            // Track highest average
            if (average > highestAverage) {
                highestAverage = average;
                highestTicket = ticket;
            }
        }

        // Final result
        System.out.println(
                "The winning number with the highest average is: "
                        + highestTicket + " with an average of " + highestAverage
        );
    }
}
