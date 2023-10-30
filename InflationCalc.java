package ProjectX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InflationCalc extends Calculator {

    private double inflation;
    private double interest;
    private int savings;
    private int years;

    public InflationCalc(double inflation, double interest, int savings, int years) {
        this.inflation = inflation;
        this.interest = interest;
        this.savings = savings;
        this.years = years;
    }

    public InflationCalc() {

    }

    public void newCalculator() {
        Scanner scanner = new Scanner(System.in);
        InflationCalc inf1 = new InflationCalc();

        try {

            System.out.print("Enter the inflation: ");
            inf1.setInflation(scanner.nextDouble());

            System.out.print("Enter the interest: ");
            inf1.setInterest(scanner.nextDouble());

            System.out.print("Enter the value of your savings: ");
            inf1.setSavings(scanner.nextInt());

            System.out.print("Enter years: ");
            inf1.setYears(scanner.nextInt());

            System.out.println(inf1.getResult());

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        }
        
    }

    public long getResult() {
        double futureValue = savings;

        for (int i = 0; i < years; i++) {
            futureValue -= futureValue * (inflation / 100 - interest / 100);
        }

        return (long) futureValue;

    }

    public double getInflation() {
        return inflation;
    }

    public void setInflation(double inflation) {
        this.inflation = inflation;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public long getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

}
