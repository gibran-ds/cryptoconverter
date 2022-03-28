package cryptoconverter.implementations;

import credentials.EmailCredentials;
import cryptoconverter.interfaces.ILoginStrategy;

public class EmailLoginStrategy implements ILoginStrategy {

    @Override
    public boolean login(Object credentials) {
        if(credentials instanceof EmailCredentials){
            EmailCredentials emailCredentials = (EmailCredentials)credentials;
            System.out.println("Iniciando sesión con Email");
            System.out.println("Escribe tu email: ...");
            System.out.println("Escribe tu password: ...");
            // LOGICA DE INICIO POR EMAIL
            return true;
        }else{
            throw new IllegalArgumentException("Login data is not credentials valid object");
        }
    }
    
}
