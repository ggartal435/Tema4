package introPOO;


public class CajaCarton {

    private double ancho;
    private double alto;
    private double largo;
    private double peso;   
    
    public CajaCarton(double ancho, double alto, double largo, double peso){
        this.ancho=ancho;
        this.alto=alto;
        this.largo=largo;
        this.peso=peso;
        
    }
    
    public void abrir(){
        
    }
    
    public void cerrar(){
        
    }

    public String getAtributos(double ancho, double alto, double largo, double peso){
        return "El alto es de: "+ this.alto + "\n" +
        "El ancho es de: " + this.ancho + "\n" +
        "El largo es de: " + this.largo + "\n" +
        "El peso es de: " + this.peso + "\n";
    }
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
