// File: simulacion.java
// Clase encargada de simular el viaje interplanetario día a día con eventos aleatorios y decisiones S/N
import java.util.Random;
import java.util.Scanner;

public class simulacion {
    public static void iniciarViaje(Scanner entrada, infoplanetas planeta, nave nave) {
        double distanciaRestante = planeta.getDistancia();
        int dias = 0;
        Random random = new Random();

        System.out.println("\nIniciando viaje a " + planeta.getNombre() + "...");
        while (distanciaRestante > 0 && nave.getVida() > 0 && nave.getOxigeno() > 0) {
            dias++;
            distanciaRestante -= nave.getVelocidad() * 24;
            nave.consumirCombustible(1000);
            nave.consumirOxigeno(1);

            // Estado diario
            System.out.println("\nDía " + dias);
            System.out.println("Distancia restante: " + distanciaRestante + " km");
            System.out.println(nave.mostrarInfo());

            // Evento aleatorio
            switch (random.nextInt(5)) {
                case 0:
                    System.out.println("☄ Meteoritos: Vida -20");
                    nave.reducirVida(20);
                    preguntarYN(entrada, "¿Activar escudo (+10 vida)? (S/N): ", () -> {
                        nave.repararNave(10);
                        System.out.println("Escudo activado. Vida +10.");
                    });
                    break;
                case 1:
                    System.out.println("Tormenta solar: Vida -10");
                    nave.reducirVida(10);
                    break;
                case 2:
                    System.out.println("Reciclaje activado: Oxígeno +5%");
                    nave.aumentarOxigeno(5);
                    break;
                case 3:
                    System.out.println("Fuga de oxígeno: -10% oxígeno");
                    nave.consumirOxigeno(10);
                    preguntarYN(entrada, "¿Reparar fuga (-5L combustible, +5% oxígeno)? (S/N): ", () -> {
                        nave.consumirCombustible(5);
                        nave.aumentarOxigeno(5);
                        System.out.println("Fuga reparada.");
                    });
                    break;
                default:
                    System.out.println("Viaje tranquilo...");
            }

            // Pausa de simulación
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        // Resultado final
        if (nave.getOxigeno() <= 0)      System.out.println("GAME OVER: Sin oxígeno.");
        else if (nave.getVida() <= 0)    System.out.println("GAME OVER: Nave destruida.");
        else {
            System.out.printf("¡Llegaste a %s en %d días!\n", planeta.getNombre(), dias);
            System.out.println("Enfrentaste a " + planeta.getCriaturaFinal() + ". ¡Victoria!");
        }
    }

    // Método auxiliar para validar S/N y ejecutar acción
    private static void preguntarYN(Scanner entrada, String mensaje, Runnable accion) {
        String res;
        do {
            System.out.print(mensaje);
            res = entrada.next();
        } while (!res.equalsIgnoreCase("S") && !res.equalsIgnoreCase("N"));
        if (res.equalsIgnoreCase("S")) accion.run();
    }
}