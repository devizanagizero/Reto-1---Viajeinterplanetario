import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        
        infoplanetas marte = new infoplanetas("Marte", 225_000_000, 3.7, "Dióxido de carbono", "RoboTitan");
        infoplanetas jupiter = new infoplanetas("Júpiter", 778_000_000, 24.8, "Hidrógeno y Helio", "Bestia Tempestaria");
        infoplanetas neptuno = new infoplanetas("Neptuno", 4_500_000_000L, 11.2, "Metano y Nitrógeno", "Ser de Hielo Eterno");

        nave nave1 = new nave("Explorador X", 50000, 100000, 100, 100);
        nave nave2 = new nave("Galaxy Voyager", 80000, 150000, 100, 100);
        nave nave3 = new nave("Nebula Cruiser", 60000, 120000, 100, 100);

        infoplanetas planetaSeleccionado = null;
        nave naveSeleccionada = null;

        boolean salir = false;
        while (!salir) {
            System.out.println(" Bienvenido al Sistema de Viaje Interplanetario");
            System.out.println("1. Seleccionar un planeta de destino");
            System.out.println("2. Seleccionar una nave espacial");
            System.out.println("3. Iniciar la simulación del viaje");
            System.out.println("4. Salir del programa");
            System.out.print("Elige una opción: ");

            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    planetaSeleccionado = SistemadeViajeInterplanetario.elegirPlaneta(entrada, marte, jupiter, neptuno);
                    break;
                case 2:
                    naveSeleccionada = SistemadeViajeInterplanetario.elegirNave(entrada, nave1, nave2, nave3);
                    break;
                case 3:
                    if (planetaSeleccionado != null && naveSeleccionada != null) {
                        simulacion.iniciarViaje(entrada, planetaSeleccionado, naveSeleccionada);
                    } else {
                        System.out.println(" Debes seleccionar un planeta y una nave antes de iniciar la simulación.");
                    }
                    break;
                case 4:
                    salir = true;
                    System.out.println(" Saliendo del programa. ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println(" Opción inválida. Inténtalo de nuevo.");
            }
        }
        entrada.close();
    }
}

    
