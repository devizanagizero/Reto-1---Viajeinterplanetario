// File: App.java
// Aplicación principal con menú para seleccionar planeta, nave y simular viaje
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        infoplanetas[] planetas = {
            new infoplanetas("Marte", 225_000_000L, 3.7, "Dióxido de carbono", "RoboTitan"),
            new infoplanetas("Júpiter", 778_000_000L, 24.8, "Hidrógeno y Helio", "Bestia Tempestaria"),
            new infoplanetas("Neptuno", 4_500_000_000L, 11.2, "Metano y Nitrógeno", "Ser de Hielo Eterno")
        };
        nave[] naves = {
            new nave("Explorador X", 50000, 100000, 100, 100),
            new nave("Galaxy Voyager", 80000, 150000, 100, 100),
            new nave("Nebula Cruiser", 60000, 120000, 100, 100)
        };

        infoplanetas seleccionadoP = null;
        nave seleccionadoN = null;
        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Seleccionar planeta");
            System.out.println("2. Seleccionar nave");
            System.out.println("3. Iniciar simulación");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            switch (entrada.nextInt()) {
                case 1:
                    for (int i=0; i<planetas.length; i++)
                        System.out.printf("%d. %s\n", i+1, planetas[i].getNombre());
                    System.out.print("Selecciona: ");
                    int p = entrada.nextInt()-1;
                    if (p>=0 && p<planetas.length) seleccionadoP = planetas[p];
                    break;
                case 2:
                    for (int i=0; i<naves.length; i++)
                        System.out.printf("%d. %s\n", i+1, naves[i].getNombre());
                    System.out.print("Selecciona: ");
                    int n = entrada.nextInt()-1;
                    if (n>=0 && n<naves.length) seleccionadoN = naves[n];
                    break;
                case 3:
                    if (seleccionadoP != null && seleccionadoN != null)
                        simulacion.iniciarViaje(entrada, seleccionadoP, seleccionadoN);
                    else System.out.println("Selecciona primero planeta y nave.");
                    break;
                case 4:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        entrada.close();
    }
}