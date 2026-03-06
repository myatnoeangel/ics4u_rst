public class ValidationChecker {

    // Method to check if a number is valid
    public static void isValid(int num) {
        // Applying De Morgan's Law: !(A || B) == (!A && !B)
        if (num >= 10 && num <= 100 && num % 3 != 0 && num % 5 != 0) {
            System.out.println(num + " is a valid input.");
        } else {
            // Give specific reasons for invalid input
            if (num < 10 || num > 100) {
                System.out.println(num + " is invalid: number must be between 10 and 100.");
            } else if (num % 3 == 0 || num % 5 == 0) {
                System.out.println(num + " is invalid: number must not be divisible by 3 or 5.");
            } else {
                System.out.println(num + " is invalid.");
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        isValid(15);   // Invalid (divisible by 3 and 5)
        isValid(50);   // Invalid (divisible by 5)
        isValid(77);   // Valid
        isValid(9);    // Invalid (less than 10)
        isValid(99);   // Valid
        isValid(105);  // Invalid (greater than 100)
    }
}
