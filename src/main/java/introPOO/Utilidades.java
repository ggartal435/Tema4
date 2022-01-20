package introPOO;

import java.util.Random;
import javax.swing.JOptionPane;


public class Utilidades {

    public int generarAleatorios(int inicio , int fin){
            Random random = new Random();
            int numAleatorio = random.nextInt(fin - inicio +1)+ inicio;
            return numAleatorio;

}
    
}
