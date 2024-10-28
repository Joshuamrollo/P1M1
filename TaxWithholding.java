public class TaxWithholding {
    public double calcWeeklyTaxWithholding(double income) {
        double taxWithholding = (float) 0;

        if(income < 500){
            taxWithholding += income * 0.10;
        } else if (income < 1500){
            taxWithholding += 500 * 0.1;
            income -= 500;
            taxWithholding += income * 0.15;
        } else if (income < 2500){
            taxWithholding += 1000 * 0.15;
            income -= 1000;
            taxWithholding += income * 0.20;
        } else {
            taxWithholding += 1000 * 0.20;
            income -= 1000;
            taxWithholding += income * 0.30;
        }
        System.out.println(taxWithholding);
        return taxWithholding;
    }
}
/*
Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines:

Income less than $500: tax rate 10%
Incomes greater than/equal to $500 and less than $1500: tax rate 15%
Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
Incomes greater than/equal to $2500: tax rate 30%
 */