
package cryptoconverter.implementations;

import credentials.EmailCredentials;
import cryptoconverter.interfaces.ILoginStrategy;

public class LoginContext {
    private ILoginStrategy strategy;

    public void setStrategy(ILoginStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean login(){
        return this.strategy.login(
            new EmailCredentials("john.wick@gmail.com", "1234")
        );
    }
}
