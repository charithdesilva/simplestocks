package au.com.stockintel.utils;

import au.com.stockintel.model.Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by charithdesilva on 2/02/2019.
 */
public class StocksGen {

    public static List<Stock> generateRandomList(Integer minutes) {
        List<Stock> stockList = new ArrayList<>();
        IntStream.range(0, minutes).forEach(m -> {
            int stockValue = ThreadLocalRandom.current().nextInt(10, 1000);
            // System.out.println("Stock Values added : "+ stockValue);
            stockList.add(new Stock(m, stockValue));
        });
        return stockList;
    }

    public static List<Stock> generateListOfStocks(int[] stocks) {
        List<Stock> stockList = new ArrayList<>();
        AtomicInteger aint = new AtomicInteger();
        Arrays.stream(stocks).forEach(val -> {
            // System.out.println("Stock Values added : "+ val);
            stockList.add(new Stock(aint.getAndIncrement(), val));
        });
        return stockList;
    }

}
