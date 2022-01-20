package cafetera;

//Partes de una clase:
//  Definicion
public class Cafetera {

    //Atributos, tambien llamados campos o propiedades.
    private double capacidadMax;
    private double cantidadActual;

    //Metodos que son los:
    //Constructores
    public Cafetera() {
        this.capacidadMax = 1000;
        this.cantidadActual = 0;
    }

    
    public Cafetera(double capacidadMax) {
        if(capacidadMax<=0){    //la cafetera no puede tener una capacidad de 0
            this.capacidadMax=1;//por lo que se crea con capacidad de 1.
            this.cantidadActual= this.capacidadMax;
        }
    }
    
    public Cafetera(double capacidadMax, double cantidadActual) {
        this.capacidadMax= capacidadMax;
        this.cantidadActual= Math.abs(capacidadMax);
        
        if(capacidadMax<=0){    //la cafetera no puede tener una capacidad de 0
            this.capacidadMax=1;//por lo que se crea con capacidad de 1.
            this.cantidadActual= this.capacidadMax;
        }
        if(cantidadActual>this.capacidadMax){
            this.capacidadMax= this.cantidadActual;
        }
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMax;
    }
    
    public void servirTaza(double cantidadAServir){
        double cantidadPositiva = Math.abs(cantidadAServir);
        if(cantidadPositiva>this.cantidadActual){
            this.cantidadActual=0;
        }else{
            this.cantidadActual-=cantidadPositiva;
        }
    }

    //Getters y Setters
    //toString
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadActual=" + cantidadActual + '}';
    }
    //Implicacion que tiene el tipo de definicion de clase "private" y "public"
    //el encapsulamiento que es y como se hace

    
}
