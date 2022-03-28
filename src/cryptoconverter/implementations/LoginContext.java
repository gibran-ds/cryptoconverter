
package cryptoconverter.implementations;

import cryptoconverter.interfaces.ILoginStrategy;

public class LoginContext {
    private ILoginStrategy strategy;

    public void setStrategy(ILoginStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean login(){
        return this.strategy.login();
    }
}
