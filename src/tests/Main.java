package tests;

import cryptoconverter.implementations.DollarToBitcoinAdapter;
import cryptoconverter.MyAPP;
import currencies.Dollar;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyAPP myApp = new MyAPP(new DollarToBitcoinAdapter());
        List<Dollar> dollarsList = new ArrayList<>();
        dollarsList.add(new Dollar(44227));
        dollarsList.add(new Dollar(44227*2));
        myApp.processPayments(dollarsList);
    }
    
}
