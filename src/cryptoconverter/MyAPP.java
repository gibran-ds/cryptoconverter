package cryptoconverter;

import cryptoconverter.interfaces.IPaymentsService;
import currencies.Dollar;
import java.util.List;

/**
 * MyApp main class. This contains the business logic. 
 * Note that all payments are made with dollars
 */
public class MyAPP {

    private final IPaymentsService paymentsService;

    public MyAPP(IPaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }
    
    /**
     * Process a list of payments in dollars using the appropriate service (adapter)
     * @param dollarsList 
     */
    public void processPayments(List<Dollar> dollarsList){
        dollarsList.forEach(dollars ->{
            System.out.printf("Making MyApp payment: %.2f %s %n", 
            dollars.getAmount(),
            dollars.getSymbol()); 
            this.paymentsService.pay(dollars);
        });
    }
}
