package cryptoconverter.implementations;

public class EtherPriceChangesPublisher extends PriceChangesPublisher {

    @Override
    public void run() {
        // TODO: BUSINESS LOGIC... HTTP REQUEST TO BITCOIN SERVERS...
        float price = (float)(Math.random() * 4000);
        this.notifyNewPrice(price);
    }
    
}
