package tests;

import cryptoconverter.implementations.DollarToBitcoinAdapter;
import cryptoconverter.MyAPP;
import cryptoconverter.implementations.AlertPriceChangeSubscriber;
import cryptoconverter.implementations.BitcoinPriceChangesPublisher;
import cryptoconverter.implementations.CellPhoneLoginStrategy;
import cryptoconverter.implementations.DollarToEtherAdapter;
import cryptoconverter.implementations.EmailLoginStrategy;
import cryptoconverter.implementations.EtherPriceChangesPublisher;
import cryptoconverter.implementations.LoginContext;
import cryptoconverter.implementations.PriceChangesPublisher;
import currencies.Dollar;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

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
        
//        LoginContext loginContext = new LoginContext();
//        loginContext.setStrategy(new EmailLoginStrategy());
//        boolean loginResult = loginContext.login();
//        if(loginResult){
//            System.out.println("Bienvenido por Email");
//            return;
//        }
//        
//        loginContext.setStrategy(new CellPhoneLoginStrategy());
//        loginResult = loginContext.login();
//        if(loginResult){
//            System.out.println("Bienvenido por Celular");
//            return;
//        }

        BitcoinPriceChangesPublisher bitcoinsPublisher = new BitcoinPriceChangesPublisher();
        EtherPriceChangesPublisher etherPublisher = new EtherPriceChangesPublisher();
        
        bitcoinsPublisher.subscribe(new AlertPriceChangeSubscriber());
        new Timer().scheduleAtFixedRate(bitcoinsPublisher, 0, 1000);
        new Timer().scheduleAtFixedRate(etherPublisher, 0, 2000);
        new CryptoDisplay(bitcoinsPublisher, etherPublisher).setVisible(true);
    }
    
}
