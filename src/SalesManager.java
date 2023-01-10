public class SalesManager {

    protected int[] sales;

    public SalesManager() {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }public int min() {
        int min = 10000;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }public int sum() {
        int sum=0;
        for (int i = 0; i < sales.length ; i++) {
            sum+=sales[i];
            
        }
        return sum;
    }

}
