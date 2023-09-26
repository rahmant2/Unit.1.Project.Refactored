public class TipCalculator {
    private double tipPercent;
    private double billTotal;
    private int pplAmt;


    public TipCalculator(double billAmt, double tipPercentage, int people)
    {
        tipPercent = tipPercentage;
        billTotal = billAmt;
        pplAmt = people;

        double finalBill = (billAmt * (tipPercentage/100)) + billAmt;
        double totalTip = billAmt * (tipPercentage/100);
        double totalPerPerson = finalBill / people;
        double tipPerPerson = totalTip / people;


        System.out.println("The total bill came out to: " + String.format("%.2f", finalBill));
        System.out.println("The total tip was: " + String.format("%.2f", totalTip));
        System.out.println("The bill split up per person comes out to: " + String.format("%.2f", totalPerPerson));
        System.out.println("The tip split up per person comes out to: " + String.format("%.2f",tipPerPerson));


    }




}
