/**
 * CSC 402-02 Assignment #1
 * 
 * On my honor, Samuel Auman, this assignment is my own work.
 * I, Samuel Auman, will follow the instructor's rules and processes
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class A1 {

    // Do NOT change the following line except the SIZE value.
    public static int SIZE = 7;

    public static void main(String[] args) {

        // Do NOT change the following two lines.
        if (args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);

        // ---------------------------------------------------------------------
        // Fill in your code here
        hashtags();
        plus();
        hashtags();
        middle();
        equals();
        percentage();
        //
        // ---------------------------------------------------------------------
    }

    // ---------------------------------------------------------------------
    // Fill in your code here

    // You are not allowed to use anything besides println/print statements,
    // static methods, method calls, loops, nested loops, local variables, and class
    // constants.

    // You are NOT allowed to use method parameters, methods that return values, or
    // conditional statements (i.e., if, if/else statements).
    public static void hashtags() {
        for (int space = 1; space < (4 * SIZE) + 3; space++) {
            System.out.print(" ");
        }
        for (int tag = 0; tag < (2 * SIZE) - 1; tag++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void plus() {
        for (int line = 0; line < (3 * SIZE) - 2; line++) {
            for (int space = 1; space < (4 * SIZE) + 3; space++) {
                System.out.print(" ");
            }
            for (int plus = 0; plus < (2 * SIZE) - 1; plus++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void middle() {
        for (int line = 0; line < ((SIZE * SIZE)) + 1; line++) {
            for (int space = 1; space < 4 * SIZE + 1; space++) {
                System.out.print(" ");
            }
            for (int carrot = 0; carrot < (2 * SIZE) + 3; carrot++) {
                System.out.print("^");
            }
            System.out.println();
            for (int space = 1; space < 4 * SIZE + 1; space++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int alter = 0; alter < SIZE; alter++) {
                System.out.print("-");
                System.out.print("+");
            }
            System.out.print("-");
            System.out.println("/");
        }
        for (int space = 1; space < 4 * SIZE + 1; space++) {
            System.out.print(" ");
        }
        for (int carrot = 0; carrot < (2 * SIZE) + 3; carrot++) {
            System.out.print("^");
        }
        System.out.println();
    }

    public static void equals() {
        for (int equals = 0; equals < SIZE / 2 + 1; equals++) {
            for(int blank = 0; blank < (SIZE / 2) * 3 + (-3*equals); blank++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int i = 0; i < ((SIZE / 2) * 7) + ((SIZE % 2) * 5) + (3 * equals); i++){
                System.out.print("=");
                System.out.print("-");
            }
            System.out.print("=");
            System.out.println("\\");
        }
    }

    public static void percentage() {
        for (int percent = 0; percent < 2 * SIZE - 1; percent++) {
            System.out.print("/");
            for (int quote = 0; quote < 5 * SIZE; quote++) {
                System.out.print("\"");
                System.out.print("%");
            }
            System.out.print("\"");
            System.out.print("\\");
            System.out.println();        }
    }
    //
    // ---------------------------------------------------------------------
}
