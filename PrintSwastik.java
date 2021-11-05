import java.util.Scanner;
public class PrintSwastik {

    public static void printSpace() {
        System.out.print("  ");
    }

    public static void printStar() {
        System.out.print("* ");
    }
    public static void main(String args[]) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nPress q to exit anytime ");
            System.out.print("Please enter value of n > 3:\t");
            String input = sc.nextLine();
            if (input.toLowerCase().equals("q")) {
                break;
            } else {
                try {
                    n = Integer.parseInt(input);
                    n = (n % 2 == 0) ? n + 1 : n;
                    if (n < 4) {
                        n = 0;
                    }
                } catch (Exception e) {
                    n = 0;
                } finally {
                    System.out.println("Printing for "+n+" stars");
                    for (int i = 0; i < n; i++) {
                        if (i < (n / 2)) { // top pyramid
                            printStar();
                            for (int j = 0; j < (n / 2) - 1; j++) {
                                printSpace();
                            }
                            if (i == 0) {
                                for (int j = (n / 2); j < n; j++) {
                                    printStar();
                                }
                            } else {
                                printStar();
                                for (int j = 0; j < (n / 2) - 1; j++) {
                                    printSpace();
                                }
                            }
                        } else if (i == (n / 2)) { // center line
                            
                            for (int j = 0; j < n; j++) {
                                printStar();
                            }
                        } else { // bottom pyramid
                        //printing spaces in the quad except last line
                        //printing star in the last line
                            for (int j = 0; j < (n / 2); j++) {
                                if (i == (n - 1)) {
                                    printStar();
                                } else {
                                    printSpace();
                                }
                            }
                            printStar();
                            for (int j = 0; j < (n / 2) - 1; j++) {
                                printSpace();
                            }
                            printStar();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}