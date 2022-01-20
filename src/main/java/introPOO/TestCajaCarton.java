package introPOO;

import java.util.Scanner;

public class TestCajaCarton {

       public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaPequeña = new CajaCarton(25, 30, 15, 17);
    }
    
       Scanner teclado = new Scanner(System.in);
       int num1 = teclado.nextInt();
       int num2 = teclado.nextInt();
       Utilidades aleatorio = new Utilidades();
       
       int resultado = aleatorio.generarAleatorios(num1, num2);
       
}
