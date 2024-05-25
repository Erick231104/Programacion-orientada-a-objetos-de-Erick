public class Auto extends VehiculoPasajeros {

    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje,int numpasajeros,String tipoCombustible) {
        super (marca, modelo, año, kilometraje,numpasajeros);
        this.tipoCombustible = tipoCombustible;
        
    }

    //Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
     
    // Sobrescribir el metodo mostrarInfo ()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    @Override
    public void realizarMantenimientos() {
        System.out.println("Realizando mantenimiento  del auto...");
        System.out.println("Cambiando aceite...");
        System.out.println("Revisando frenos...");
    }
     
    public int costoDeMantenimiento;
    private int costoPorKm;
    private int  kilometrosRecorridos;

    
   
    public double costoDeMantenimiento(int costoPorKm, int kilometrosRecorridos) {
        this.costoPorKm = costoPorKm;
        this.kilometrosRecorridos = kilometrosRecorridos;
        costoDeMantenimiento = costoPorKm * kilometrosRecorridos;
        return costoDeMantenimiento;
    }

    public int getCostoPorKm() {
        return costoPorKm;
    }

    public void setCostoPorKm(int costoPorKm) {
        this.costoPorKm = costoPorKm;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = (int) kilometrosRecorridos;
    }

    
    public void realizarMantenimiento() {
        System.out.println("Realizando el  coto total de kilometros recorridos  del auto:  ");
        System.out.println("costoPOrKm: " + costoPorKm);
        System.out.println("kilometrosRecoridos: " + kilometrosRecorridos);
        System.out.println("El coto Total es: " + costoDeMantenimiento);

    }

   

   
}


