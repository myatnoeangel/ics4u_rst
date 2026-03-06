import java.util.ArrayList;
import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10);
        ArrayList<String> names = initializeNames();

        printArrayUsingFor(numbers);
        printArrayUsingForEach(numbers);
        printArrayListUsingFor(names);
        printArrayListUsingForEach(names);

        int[] oddNumbers = removeEvenNumbers(numbers);
        printOddNumbersArray(oddNumbers);

        removeShortNames(names);
        printFilteredNames(names);
    }

    // Generate random integers from 0 to 99
    public static int[] generateRandomNumbers(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    // Initialize names in ArrayList
    public static ArrayList<String> initializeNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Linn");
        names.add("Bill");
        names.add("Myat");
        names.add("Noe");
        names.add("Angel");
        names.add("Evelyn");
        names.add("Amanda");
        return names;
    }

    // Print array using for loop
    public static void printArrayUsingFor(int[] arr) {
        System.out.println("Array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Print array using for-each loop
    public static void printArrayUsingForEach(int[] arr) {
        System.out.println("Array using for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    // Print ArrayList using for loop
    public static void printArrayListUsingFor(ArrayList<String> list) {
        System.out.println("ArrayList using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
    }

    // Print ArrayList using for-each loop
    public static void printArrayListUsingForEach(ArrayList<String> list) {
        System.out.println("ArrayList using for-each loop:");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println("\n");
    }

    // Method to remove even numbers from array
    public static int[] removeEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    // Print array after even numbers removed
    public static void printOddNumbersArray(int[] arr) {
        System.out.println("Array with even numbers removed:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    // Method to remove names shorter than 4 characters
    public static void removeShortNames(ArrayList<String> list) {
        // Lambda expression used for concise filtering
        list.removeIf(name -> name.length() < 4);
    }

    // Print ArrayList after removing short names
    public static void printFilteredNames(ArrayList<String> list) {
        System.out.println("ArrayList with names shorter than 4 characters removed:");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
