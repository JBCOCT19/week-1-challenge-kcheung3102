


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int flag = 0;
        String choice = "";
        String playing ="";
        //randNum variables
        Random r = new Random();
        int randomNum = 0;
        int low = 1;
        int high = 250;
        randomNum = r.nextInt(high - low) + low;
        boolean isPrime = true;


        do {
            System.out.println("Would you like to generate random number or input number?(r/i)");
            choice = keyboard.nextLine();

            if (choice.equalsIgnoreCase("i")) {
                    System.out.println("Enter a number");
                    n = keyboard.nextInt();
                    //prime num checker
                    if (n <= 1) {
                        System.out.println(n + " is not a prime number");
                    } else {
                        for (i = 2; i <= n / 2; i++) {  //loop to check if n is divisible by any num other than 1 and itself
                            if (n % i == 0) {    //checks if it divides by itself
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(n + "  is a Prime Number");
                        } else {
                            System.out.println(n + " is not a Prime Number");
                        }
                    }

            } else if (choice.equalsIgnoreCase("r")) {
                System.out.println("Generating Random Number....");
                    if (randomNum == 0 || randomNum <= 1) {
                        System.out.println(randomNum + " is not a prime number");
                    } else {
                        {
                            if (randomNum % randomNum == 0) {
                                isPrime = false;
                            }
                        }
                        if (isPrime) {
                            System.out.println(randomNum + " a prime number");
                        } else {
                            System.out.println(randomNum + " is not a prime number");
                        }
                    }

                }
            System.out.println("Would you like to try again?(Y/N)");
            playing = keyboard.nextLine();
            }
            while(playing.equalsIgnoreCase("y"));
            System.out.println("Thanks for playing");
        }
    }






