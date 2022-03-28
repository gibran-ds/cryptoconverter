
package cryptoconverter.implementations;

import cryptoconverter.interfaces.ILoginStrategy;
import javax.swing.JOptionPane;

public class CellPhoneLoginStrategy implements ILoginStrategy{

    @Override
    public boolean login() {
        // TODO: BUSINESS LOGIC
        String email = JOptionPane.showInputDialog(null, "Escribe tu celular", "Información");
        String smsCode = JOptionPane.showInputDialog(null, "Escribe código SMS", "Información");
        if(email.equalsIgnoreCase("6441223344") && smsCode.equalsIgnoreCase("1111")){
            return true;
        }else{
            return false;
        }
    }
    
}
