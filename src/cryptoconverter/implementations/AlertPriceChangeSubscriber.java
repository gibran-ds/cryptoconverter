package cryptoconverter.implementations;

import cryptoconverter.interfaces.IPriceChangeSubscriber;
import javax.swing.JOptionPane;

public class AlertPriceChangeSubscriber implements IPriceChangeSubscriber{

    @Override
    public void onPriceChanged(float price) {
//        JOptionPane.showMessageDialog(null, price + " USD", 
//                "Nuevo precio", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Price changed: " + price + " USD");
    }
    
}
