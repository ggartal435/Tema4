package tarjetaCredito;

import javax.swing.JOptionPane;

public class TarjetaCredito {

    private String entidad;
    private String numCuenta;
    private Object fechaCaducidad;
    private String titular;
    private int pin;
    private double limiteCredito;
    private int cvv;
    private boolean estadoActivado;

    public TarjetaCredito(String entidad, String numCuenta, Object fechaCaducidad, String titular, int pin, int limiteCredito, int cvv, boolean estadoActivado) {
        this.entidad = entidad;
        do {
            if (comprobarTarjeta(numCuenta)) {
                this.numCuenta = numCuenta;
            } else {
                JOptionPane.showConfirmDialog(null, "El numero de cuenta no era valido, pruebe otra vez");
            }
        } while (!comprobarTarjeta(numCuenta));
        this.fechaCaducidad = fechaCaducidad;
        this.titular = titular;
        this.pin = pin;
        this.limiteCredito = limiteCredito;
        this.cvv = cvv;
        this.estadoActivado = estadoActivado;
    }

    public boolean comprobarTarjeta(String numCuenta) {

        boolean comprobante = true;

        String numCuentaNoblkSpace = numCuenta.trim();

        int i;

        for (i = 0; i < numCuentaNoblkSpace.length(); i++) {

            if (!Character.isDigit(numCuentaNoblkSpace.charAt(i))) {
                comprobante = false;
                break;
            }
        }

        if (numCuentaNoblkSpace.length() > 16 || numCuentaNoblkSpace.length() < 16) {
            comprobante = false;

        }
        return comprobante;
    }

    //GETTERS AND SETTERS
    public String getEntidad() {
        return entidad;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Object getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getCvv() {
        return cvv;
    }

    public boolean isEstadoActivado() {
        return estadoActivado;
    }

    public void setEstadoActivado(boolean estadoActivado) {
        this.estadoActivado = estadoActivado;
    }

}
