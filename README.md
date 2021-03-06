# Simple Stocks App

Basic functions
---------------
 - Works out ideal buy index and sell index of historical stock indices.
 - Accept array or list of _Stock_(s).
 - Auto generate stocks mimicking stockAPI.
 - Specifies the time spent on operations.

How to run
--------------------
 - Import project to your ide that supports java (jdk 1.8+)
 - Start StockRunner main program.
 - To manually input stocks using array, uncomment int[] stocksYesterday
 - In order to auto-generate random stocks with period (minutes from 10AM), uncomment List<Stock> stocksYesterday
 - For more verbose generated list, uncomment prints on _StocksGen_
 ```
public class StockRunner {

    public static void main(String... args) {

        /**
         * printStocks accepts either array or list of stocks where
         * the index signifies the time (started from 10AM local time)
         */

        // uncomment to run different forms.
        // uncomment StocksGen's prints to inspect the lists generated

        // Array input
        int[] stocksYesterday = {10,12,22,2,22,9};

        // List input (420 = minutes from 10AM - 5PM.)
        //List<Stock> stocksYesterday = StocksGen.generateRandomList(420);

        StockIntelApp stockIntelApp = new StockIntelApp();
        stockIntelApp.printStocks(stocksYesterday);
    }
}
 ```

 Output
 ==========
 ![](https://github.com/charithdesilva/simplestocks/blob/master/Screen.png)