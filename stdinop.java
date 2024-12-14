import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers from input until the end of input
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        
        // Close the scanner after reading all the input
        scanner.close();
    }
}
