
package cryptoconverter.interfaces;

import currencies.Dollar;

/**
 * The contract all MyApp payments processors must achieve 
 */
public interface IPaymentsService {
    /**
     * Payment service. All payments must use dollars as currency
     * @param dollars 
     */
    public void pay(Dollar dollars);
}
