package SmartCalculator;
import java.util.Scanner;

public class Calculator {
    double simpleInterest;
    double CI;
    double percentage;
    double principal, rate, time;
    int fact = 1;
    double mean;

    static Scanner sc = new Scanner(System.in);

    public Calculator() {

    }

    public double calculateSimpleInterest() {
        simpleInterest = principal * time * rate / 100;
        return simpleInterest;
    }

    public double calculateCompoundInterest() {
        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the time: ");
        time = sc.nextDouble();

        System.out.print("Enter the rate: ");
        rate = sc.nextDouble();

        CI = principal * (Math.pow((1 + rate / 100), time));
        return CI;
    }

    public double calculateMean() {
        System.out.print("Enter for how many numbers you want to calculate mean: ");
        int size = sc.nextInt();

        double[] nums = new double[size];

        System.out.println("Enter numbers one by one: ");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextDouble();
        }

        double sum = 0;
      
        for (int i = 0; i < size; i++)
            sum = sum + nums[i];
        mean = sum / size;
        return mean;
    }

    public int calculateFactorial() {
        System.out.print("Enter Number to Calculate Factorial of a Number: ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--)
            fact = fact * i;
        return fact;
    }

    public double calculatePercentage() {
        System.out.print("Enter the total marks: ");
        double totalmarks = sc.nextDouble();

        System.out.print("Enter the marks obtained: ");
        double marksObtained = sc.nextDouble();

        percentage = (marksObtained * 100) / totalmarks;
        return percentage;
    }

    // Getters

    public double getSimpleInterest() {
        return simpleInterest;
    }

    public double getCompoundInterest() {
        return CI;
    }

    public double getMean() {
        return mean;
    }

    public int getFactorial() {
        return fact;
    }

    public double getPercentage() {
        return percentage;
    }

    // Setters

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("\t\tCalculation of Simple Interest");
         System.out.println("Enter the principal amount : ");
         double p = sc.nextDouble();
         System.out.println("Enter the time : ");
         double t = sc.nextDouble();
         System.out.println("Enter he rate : ");
         double r = sc.nextDouble();
         calculator.setPrincipal(p);
         calculator.setRate(r);
         calculator.setTime(t);
        System.out.println("Simple Interest: " + calculator.calculateSimpleInterest());
        
        System.out.println("t\t Calculation of Compound Interest ");

        System.out.println("Compound Interest: " + calculator.calculateCompoundInterest());
        
        System.out.println("\t\tCalculation of Mean");

        System.out.println("Mean: " + calculator.calculateMean());

        System.out.println("\t\tCalculation of Factorial");
        
        System.out.println("Factorial: " + calculator.calculateFactorial());
        
        System.out.println("\t\tCalculation of Percentage");

        System.out.println("Percentage: " + calculator.calculatePercentage());
    }
}
