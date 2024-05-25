public class VehiculoCarga extends Vahiculo {

    public static int capacidadCarga;
     
    //Contructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        VehiculoCarga.capacidadCarga = capacidadCarga;
        
    }

    //Getter y Setter para capacidadCarga
    public int getrCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga (int capacidadCarga) {
        VehiculoCarga.capacidadCarga = capacidadCarga;
    }

    //Sobrescribir el metodo capacidadCarga ()
    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println(" Capacidad de carga: " + capacidadCarga + " kg");
    }

   

   


}
