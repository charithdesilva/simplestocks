package au.com.stockintel.model;

/**
 * Created by charithdesilva on 2/02/2019.
 */
public class Stock {

    private int minute;
    private int stockPrice;

    public Stock(int minute, int stockPrice) {
        this.minute = minute;
        this.stockPrice = stockPrice;
    }

    public int getMinute() {
        return minute;
    }

    public int getStockPrice() {
        return stockPrice;
    }
}
