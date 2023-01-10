public class SalesManager {

    protected long [] sales;

    public SalesManager() {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }public long min() {
        long min = 10000;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }public long sum() {
        long sum=0;
        for (long i = 0; i < sales.length ; i++) {
            sum+=sales[(int) i];
            
        }
        return sum;
    }

}
