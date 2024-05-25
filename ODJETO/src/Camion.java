public class Camion extends VehiculoCarga {

    private int numEjes;
     
    //Contructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, numEjes );
        this.numEjes = numEjes;
        
        
    }

    //Getter y Setter para numEjes
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    } 

    //Sobrescribir el metodo mostrarINfo ()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    @Override
    public void realizarMantenimientos() {
        System.out.println("Realizando mantenimiento  del camión...");
        System.out.println("Cambiando neumáticos...");
        System.out.println("Revisando suspensión...");
    }

  


}
