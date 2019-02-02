package au.com.stockintel;

import au.com.stockintel.model.Stock;
import au.com.stockintel.utils.StocksGen;

import java.util.List;

/**
 * Created by charithdesilva on 3/02/2019.
 */
public class StockRunner {

    public static void main(String... args) {

        /**
         * printStocks accepts either array or list of stocks where
         * the index signifies the time (started from 10AM local time)
         */

        // uncomment to run different forms.
        // uncomment StocksGen's prints to inspect the lists generated

        int[] stocksYesterday = {10,12,22,2,22,9};

        // 420 = minutes from 10AM - 5PM.
        //List<Stock> stocksYesterday = StocksGen.generateRandomList(420);

        StockIntelApp stockIntelApp = new StockIntelApp();
        stockIntelApp.printStocks(stocksYesterday);
    }
}
