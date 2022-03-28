package cryptoconverter.implementations;

import cryptoconverter.interfaces.ILoginStrategy;
import javax.swing.JOptionPane;

public class EmailLoginStrategy implements ILoginStrategy {

    @Override
    public boolean login() {
        // TODO: BUSINESS LOGIC
        String email = JOptionPane.showInputDialog(null, "Escribe tu correo", "Información");
        String password = JOptionPane.showInputDialog(null, "Escribe tu password", "Información");
        if(email.equalsIgnoreCase("prueba@gmail.com") && password.equalsIgnoreCase("1234")){
            return true;
        }else{
            return false;
        }
    }
    
}
