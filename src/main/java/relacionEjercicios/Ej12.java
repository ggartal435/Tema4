package relacionEjercicios;

public class Ej12 {

    public class Empleado {

        private String nombre, apellidos, nif;
        private double sueldoBase, sueldoHoraExtra, totalHoraExtra, irpf;
        private boolean casado;
        private int hijos;

        public Empleado(String nombre, String apellidos, String nif, double sueldoBase, double sueldoHoraExtra, double totalHoraExtra, double irpf, boolean casado, int hijos) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.nif = nif;
            this.sueldoBase = sueldoBase;
            this.sueldoHoraExtra = sueldoHoraExtra;
            this.totalHoraExtra = totalHoraExtra;
            this.irpf = irpf;
            this.casado = casado;
            this.hijos = hijos;
        }

        public Empleado() {
            this.sueldoBase = 1056.56;
            this.sueldoHoraExtra = 11.12;
            this.irpf = 10;
        }
    }

}
