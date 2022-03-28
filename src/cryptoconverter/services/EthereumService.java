package cryptoconverter.services;

import currencies.Ether;

public class EthereumService {
    public void pay(Ether ether){
        System.out.println("Connecting to Ethereum Blockchain...");
        System.out.println("Sending tokens...");
        System.out.printf("Making Ethereum payment: %.2f %s %n", 
            ether.getAmount(),
            ether.getSymbol());
    }
}
