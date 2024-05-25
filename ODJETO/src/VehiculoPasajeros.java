public class VehiculoPasajeros extends Vahiculo{

    private int numpasajeros;
    
    //Contructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numpasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numpasajeros = numpasajeros;
        
    
    }
    
   
    //Getter y Setter para numPasajeros
    public int getNumPasajeros() {
        return numpasajeros;
    }

    public void setNumPasajeros(int numpasajeros) {
         this.numpasajeros = numpasajeros;
    }


    //Sobrescribir el metodo mostrarInfo ()
     
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numpasajeros);
    }

    
    
    public void realizarMantenimiento() {
        System.out.println();

    }

   

   


    

}
