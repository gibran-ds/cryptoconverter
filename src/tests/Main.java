package tests;

import cryptoconverter.implementations.DollarToBitcoinAdapter;
import cryptoconverter.MyAPP;
import cryptoconverter.implementations.DollarToEtherAdapter;
import cryptoconverter.implementations.EmailLoginStrategy;
import cryptoconverter.implementations.LoginContext;
import currencies.Dollar;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Dollar> dollarsList = new ArrayList<>();
//        dollarsList.add(new Dollar(44227));
//        dollarsList.add(new Dollar(44227*2));
//        
//        MyAPP myAppBitcoins = new MyAPP(new DollarToBitcoinAdapter());
//        myAppBitcoins.processPayments(dollarsList);
//        
//        MyAPP myAppEthers = new MyAPP(new DollarToEtherAdapter());
//        myAppEthers.processPayments(dollarsList);
        
        LoginContext loginContext = new LoginContext();
        loginContext.setStrategy(new EmailLoginStrategy());
        System.out.println(loginContext.login());
    }
    
}
