
package cryptoconverter.implementations;

import cryptoconverter.interfaces.IPaymentsService;
import cryptoconverter.services.EthereumService;
import currencies.Dollar;
import currencies.Ether;

public class DollarToEtherAdapter implements IPaymentsService{

    private final float rate = 3109.84f;
    private final EthereumService ethereumService;

    public DollarToEtherAdapter() {
        this.ethereumService = new EthereumService();
    }
    
    @Override
    public void pay(Dollar dollars) {
        float etherAmount = dollars.getAmount() / this.rate;
        Ether ether = new Ether(etherAmount);
        this.ethereumService.pay(ether);
    }
    
}
