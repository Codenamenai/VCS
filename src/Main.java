import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager();
        salesManager.sales = new int []{3000, 3000, 4000, 5000, 6000, 10_000, 8000};

        System.out.println("Продажи менеджера по дням : с пн по вскр " +
                Arrays.toString(salesManager.sales) + " " +
                "Максимальные продажи менеджера за день "
                + salesManager.max());
        System.out.println("Средние обрезанные продажи составляют : "+(salesManager.sum()-(salesManager.min()+ salesManager.max()))
                /(salesManager.sales.length-2));
    }
}