public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Crear instanciaq de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 3, "Gasolina");
        auto.costoDeMantenimiento(10, 100);
        auto.realizarMantenimientos();


        Camion camion = new Camion( "Volvo", "FH", 2019, 75000, 20000, 4);
        camion.realizarMantenimientos();


       //MostrarInformacion de cada vehiculo
       System.out.println("Informacion del auto:  ");
       auto.mostrarInfo();
       auto.realizarMantenimiento();
       auto.realizarMantenimientos();

       System.out.println("Informacion del camion:  ");
       camion.mostrarInfo();
       camion.realizarMantenimientos();
       
    }
}

// Nombre = Erick Mateo Sequeira Centeno
//NUmero de carnat = 2024-1660U