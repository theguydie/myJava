import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        operators();

        switches();

        strings();
    }

    private static void operators() {
        //logic
        boolean T = true;
        boolean F = false;
        System.out.println("true || false = " + (T || F));
        System.out.println("true && (false || (!true) = " + (T && (F || (!T))));
        //ternary
        int x = 1;
        int y = 10;
        System.out.println("min(1,10) = " + ((x < y) ? x : y));

        System.out.println("Example of using binary &,|,^ and~ ");
        int num1 = 7; // 0111
        int num2 = 9; // 1001
        System.out.println("0111 & 1001 = " + (num1 & num2)); // 0001 = 1
        System.out.println("0111 | 1001 = " + (num1 | num2)); // 1111 = 15
        System.out.println("0111 ^ 1001 = " + (num1 ^ num2)); // 1110 = 14
        System.out.println("~0111 = " + (~num1)); // 11111111111111111111111111111000 = (2^32 - 1) - 7 = -8 (mod 2^32) 

        System.out.println("Example of using << and >>:");
        int value = 32; // 100000
        System.out.println("32 >> 3 = " + (value >> 3)); // 100 = 4
        System.out.println("32 << 2 = " + (value << 2)); // 10000000 = 128
    }

    private static void switches() {
        System.out.println("Example of using switch:");

        System.out.println("stirng switch:");
        String result = "good result";
        switch (result) {
            case "good result":
                System.out.println("good result");
                break;
            case "bad result":
                System.out.println("bad result");
                break;
            default:
                System.out.println("error");
        }

        System.out.println("int switch:");
        int type2 = 0;
        switch (type2) {
            case 0:
                System.out.println("This is 0");
                break;
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            default:
                System.out.println("This is > 2");
        }

        System.out.println("char switch:");
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter A");
                break;
            case 'B':
                System.out.println("Letter B");
                break;
            case 'C':
                System.out.println("Letter C");
                break;
            default:
                System.out.println("Other letter");
        }

        System.out.println("byte switch:");
        byte b = 2;
        switch (b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        System.out.println("short switch:");
        short s = 500;
        switch (s) {
            case 100:
                System.out.println("One hundred");
                break;
            case 500:
                System.out.println("Five hundred");
                break;
            case 1000:
                System.out.println("One thousand");
                break;
            default:
                System.out.println("Other");
        }

        System.out.println("enum switch:");
        enum Color {
            RED, GREEN, BLUE
        }

        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("The color is red");
                break;
            case GREEN:
                System.out.println("The color is green");
                break;
            case BLUE:
                System.out.println("The color is blue");
                break;
            default:
                System.out.println("Other");
        }
    }

    private static void strings() {
        System.out.println("Example of using strings methods");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter several words separated by spaces:");

        while (scanner.hasNext()) 
        {
            String word = scanner.next();

            // Examples of methods for working with String objects
            System.out.println("length - " + word.length());
            System.out.println("uppercase - " + word.toUpperCase());
            System.out.println("lowercase - " + word.toLowerCase());
            System.out.println("reversed - " + new StringBuilder(word).reverse().toString());

            System.out.println("Enter the next word or enter 'exit' to finish:");
            if (word.toLowerCase().equals("exit")) {
                break;
            }
        }
    }
}
