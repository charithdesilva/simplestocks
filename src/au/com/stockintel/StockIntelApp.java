package au.com.stockintel;

import au.com.stockintel.model.Stock;
import au.com.stockintel.utils.StocksGen;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by charithdesilva on 2/02/2019.
 *
 * StockIntelApp accepts either array or list of stocks where
 * the index signifies the time (started from 10AM local time)
 */

public class StockIntelApp {

    public void printStocks(int[] stocksArray) {
        // print stocks from array
        printStocks(StocksGen.generateListOfStocks(stocksArray));
    }

    public void printStocks(List<Stock> listOfStocks) {
        Long startTime = new Date().getTime();
        // in case of duplicated max stock values, stream.max resolves the first index.
        // It's problematic for scenarios like this -> {10,12,22,2,22,9}
        // Buy should be at 2 and Sell should be at 22.
        List<Stock> duplicateList = new ArrayList<>(listOfStocks);
        Collections.sort(listOfStocks, Collections.reverseOrder(Comparator.comparing(Stock::getMinute)));

        Stock maxStock = getStockStream(listOfStocks).max(Comparator.comparing(Stock::getStockPrice)).get();
        Stock minStock = getStockStream(duplicateList).limit(maxStock.getMinute()).min(Comparator.comparing(Stock::getStockPrice)).get();

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Buying for " + minStock.getStockPrice() + ", and selling for " + maxStock.getStockPrice());
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("time spent : "+(new Date().getTime() - startTime) + " milliseconds.");
    }

    private Stream<Stock> getStockStream(List<Stock> listOfStocks) {
        return listOfStocks.stream().parallel();
    }



}
