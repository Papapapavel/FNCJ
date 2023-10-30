package ProjectX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalc extends Calculator {

    private double initialInvestment; // first investment
    private int monthlyContribution; // monthly added money
    private double interest; // annualy interest rate
    private int length; // length of investmentinf

    public InterestCalc(double initialInvestment, int monthlyContribution, double interest, int length)
    {
        setInterest(interest);
        setLength(length);
        setInitialInvestment(initialInvestment);
        setMonthlyContribution(monthlyContribution);
    }

    public InterestCalc()
    {

    }

    public void newCalculator() 
    {
            Scanner scanner = new Scanner(System.in);
            InterestCalc i1 = new InterestCalc();

                try {
                    System.out.print("Enter the value of your investment: ");
                    i1.setInitialInvestment(scanner.nextDouble());

                    System.out.print("Enter the value of monthly investment: ");
                    i1.setMonthlyContribution(scanner.nextInt());

                    System.out.print("Enter the interest: ");
                    i1.setInterest(scanner.nextInt());

                    System.out.print("Enter the length of your investment: ");
                    i1.setLength(scanner.nextInt());

                    System.out.println(i1.getResult());

                } catch (InputMismatchException e) {
                    System.out.println("This is not a number");
                }
    }
    
    public long getResult() {

        double futureValue = initialInvestment;
        
        for (int i = 0; i < length * 12; i++) 
        {
            futureValue = futureValue * (1 + (interest/100)/12) + (monthlyContribution); // future value of investment that is compounded anually with monthly contribution
        }
        
        return (long) futureValue;
    } 


    public void setInitialInvestment(double initialInvestment) 
    {
        
        if(initialInvestment > -1)
        {
            this.initialInvestment = initialInvestment;
        }
        else 
            throw new IllegalArgumentException("Moc malá investice vložte investici mezi 0 a 1 000 000 000 000 "); 
    }


    public void setMonthlyContribution(int monthlyContribution) 
    {
        this.monthlyContribution = monthlyContribution;
    }

    public void setInterest(double interest) 
    {
        this.interest = interest;
    }

    public void setLength(int length) 
    {
        this.length = length;
    }


    public double getInitialInvestment() 
    {
        return initialInvestment;
    }

    public double getMonthlyContribution() 
    {
        return monthlyContribution;
    }

    public double getInterest() 
    {
        return interest;
    }

    public int getLength() 
    {
        return length;
    }

}
