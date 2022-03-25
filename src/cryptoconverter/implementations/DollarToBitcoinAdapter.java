package cryptoconverter.implementations;

import cryptoconverter.services.BitcoinService;
import cryptoconverter.interfaces.IPaymentsService;
import currencies.Bitcoin;
import currencies.Dollar;

/**
 * This is the adapter. Performs the real conversion from dollars to bitcoins
 * also, hides the access to bitcoins service
 */
public class DollarToBitcoinAdapter implements IPaymentsService {

    private float rate = 44227;
    private BitcoinService bitcoinService;
    
    public DollarToBitcoinAdapter() {
        this.bitcoinService = new BitcoinService();
    }
    
    /**
     * Process a payments using dollars but converting to bitcoins
     * @param dollars 
     */
    @Override
    public void pay(Dollar dollars) {
        System.out.println("Adapting Dollars to Bitcoins...");
        Bitcoin bitcoin = this.convert(dollars);
        this.bitcoinService.pay(bitcoin);
    }
    
    private Bitcoin convert(Dollar dollars){
        float bitcoinConversion = dollars.getAmount() / rate;
        return new Bitcoin(bitcoinConversion);
    }
    
}
