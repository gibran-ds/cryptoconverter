package cryptoconverter.services;

import currencies.Bitcoin;

/**
 * This is the Adaptee (destination) service you want to consume
 */
public class BitcoinService {
    /**
     * Simulates a payment using bitcoin as currency
     * @param bitcoin 
     */
    public void pay(Bitcoin bitcoin){
        System.out.printf("Making Bitcoin payment: %.2f %s %n", 
            bitcoin.getAmount(),
            bitcoin.getSymbol());
    }
}
