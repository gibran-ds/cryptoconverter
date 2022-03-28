
package cryptoconverter.implementations;

public class BitcoinPriceChangesPublisher extends PriceChangesPublisher {

    @Override
    public void run() {
        // TODO: BUSINESS LOGIC... HTTP REQUEST TO BITCOIN SERVERS...
        float price = (float)(Math.random() * 50000);
        this.notifyNewPrice(price);
    }
    
}
