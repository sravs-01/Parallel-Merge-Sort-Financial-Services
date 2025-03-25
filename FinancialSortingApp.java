import java.util.Arrays;
import java.util.Random;

class FinancialParallelMergeSort extends Thread {
    private double[] prices;

    public FinancialParallelMergeSort(double[] prices) {
        this.prices = prices;
    }

    private void merge(double[] left, int ls, double[] right, int rs, double[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < ls && j < rs) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < ls)
            arr[k++] = left[i++];
        while (j < rs)
            arr[k++] = right[j++];
    }

    public void run() {
        int n = prices.length;
        if (n <= 1) return;
        
        int mid = n / 2;
        double[] left = Arrays.copyOfRange(prices, 0, mid);
        double[] right = Arrays.copyOfRange(prices, mid, n);

        FinancialParallelMergeSort leftThread = new FinancialParallelMergeSort(left);
        FinancialParallelMergeSort rightThread = new FinancialParallelMergeSort(right);

        leftThread.start();
        rightThread.start();

        try {
            leftThread.join();
            rightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        merge(left, mid, right, n - mid, prices);
    }
}

public class FinancialSortingApp {
    public static void main(String[] args) {
        Random random = new Random();
        int numStocks = 20;
        double[] stockPrices = new double[numStocks];

        for (int i = 0; i < numStocks; i++) {
            stockPrices[i] = 100 + (random.nextDouble() * 900);
        }

        System.out.println("Unsorted Stock Prices: \n" + Arrays.toString(stockPrices));

        FinancialParallelMergeSort sorter = new FinancialParallelMergeSort(stockPrices);
        sorter.start();
        System.out.println("\n");
        try {
            sorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Stock Prices: \n" + Arrays.toString(stockPrices));
    }
}