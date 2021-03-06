package cryptoconverter.implementations;

import cryptoconverter.interfaces.IPriceChangeSubscriber;
import java.util.LinkedList;
import java.util.List;
import java.util.TimerTask;

public class PriceChangesPublisher extends TimerTask {
    
    private List<IPriceChangeSubscriber> subscribers;

    public PriceChangesPublisher() {
        this.subscribers = new LinkedList<>();
    }
    
    public void subscribe(IPriceChangeSubscriber subscriber){
        this.subscribers.add(subscriber);
    }
    
    public void unsubscribe(IPriceChangeSubscriber subscriber){
        if(this.subscribers.contains(subscriber)){
            this.subscribers.remove(subscriber);
        }
    }
    
    public void notifyNewPrice(float price){
        this.subscribers.forEach(subscriber -> {
            subscriber.onPriceChanged(price);
        });
    }

    @Override
    public void run() {
        // TODO: BUSINESS LOGIC... HTTP REQUEST TO BITCOIN SERVERS...
        float price = (float)(Math.random() * 50000);
        this.notifyNewPrice(price);
    }
    
}
