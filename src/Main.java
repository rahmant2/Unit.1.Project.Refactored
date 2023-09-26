import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inputs and Variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        String numBill = s.nextLine();
        double newBill = Double.parseDouble(numBill);
        System.out.print("Enter the tip percentage (Whole Num): ");
        String tipPercent = s.nextLine();
        double tipPercentage = Double.parseDouble(tipPercent);
        System.out.print("How many people will be paying? ");
        String pplNum = s.nextLine();
        int numPeople = Integer.parseInt(pplNum);


        TipCalculator total = new TipCalculator(newBill, tipPercentage, numPeople);


    }
}