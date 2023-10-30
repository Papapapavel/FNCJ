package ProjectX;

import java.util.InputMismatchException;
import java.util.Scanner;


public class mainCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        while (true) {
           
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Calculate future value with compound interest");
            System.out.println("2. Calculate future value with inflation");
            System.out.println("3. Exit\n");
            System.out.println("");
            
            try {
                System.out.print("Enter input from 1 to 3: ");
            
                switch (scanner.nextInt()) {

                    case 1 -> {
                        InterestCalc i1 = new InterestCalc();
                        i1.newCalculator();
                    }
                    case 2 -> {
                        InflationCalc inf1 = new InflationCalc();
                        inf1.newCalculator();
                    }
                    case 3 ->
                    {
                        System.out.println("Closing app");
                        scanner.close();
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException e) 
            {
                System.out.println("Bad input");
                scanner.next();
            }
            System.out.print("If you want to try again press 1: ");
            if(scanner.nextInt() == 1)
            {
                System.out.println("");
                continue;
            }
            else
                System.out.println("Closing app");
                System.exit(0);
        }

    }

}