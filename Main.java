import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TaxWithholding taxWithholding = new TaxWithholding();

        taxWithholding.calcWeeklyTaxWithholding(300);
        taxWithholding.calcWeeklyTaxWithholding(1333);
        taxWithholding.calcWeeklyTaxWithholding(1700);
        taxWithholding.calcWeeklyTaxWithholding(3442);
        taxWithholding.calcWeeklyTaxWithholding(500);
        taxWithholding.calcWeeklyTaxWithholding(1500);
        taxWithholding.calcWeeklyTaxWithholding(2500);
        taxWithholding.calcWeeklyTaxWithholding(1);
    }
}


