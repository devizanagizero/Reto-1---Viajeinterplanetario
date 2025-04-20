// File: App.java
// Aplicación simple para seleccionar un planeta e imprimir sus datos
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definimos un arreglo de planetas
        infoplanetas[] planetas = {
            new infoplanetas("Marte", 225_000_000L, 3.7, "Dióxido de carbono", "RoboTitan"),
            new infoplanetas("Júpiter", 778_000_000L, 24.8, "Hidrógeno y Helio", "Bestia Tempestaria"),
            new infoplanetas("Neptuno", 4_500_000_000L, 11.2, "Metano y Nitrógeno", "Ser de Hielo Eterno")
        };

        // Mostramos las opciones al usuario
        System.out.println("Selecciona un planeta de destino:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.printf("%d. %s (Distancia: %,d km)\n", i + 1, planetas[i].getNombre(), planetas[i].getDistancia());
        }
        System.out.print("Opción: ");

        int opcion = entrada.nextInt();
        if (opcion >= 1 && opcion <= planetas.length) {
            infoplanetas seleccionado = planetas[opcion - 1];
            System.out.println("\nHas seleccionado: " + seleccionado.getNombre());
            System.out.println("- Distancia: " + seleccionado.getDistancia() + " km");
            System.out.println("- Gravedad: " + seleccionado.getGravedad() + " m/s²");
            System.out.println("- Atmósfera: " + seleccionado.getAtmosfera());
            System.out.println("- Criatura final: " + seleccionado.getCriaturaFinal());
        } else {
            System.out.println("Opción inválida. Finalizando.");
        }

        entrada.close();
    }
}