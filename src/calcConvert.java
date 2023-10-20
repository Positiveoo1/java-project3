public class calcConvert {
    public static void main(String[] args) {
        double netCost =9.99;
        double vatRate = .23;
        double vat = netCost * vatRate;
        double grossVal = netCost +vat;
        double total = grossVal * 10000;

        System.out.println("Net cost: " + netCost);
        System.out.println("VAT rate: " + (vatRate * 100) + "%");

        System.out.println("Vat rate: " + vat);
        System.out.println("gross Value: " + grossVal);
        System.out.println("total: "+ total);

    }
}
