import java.util.Random;
import java.util.Scanner;

public class simulacion {
    public static void iniciarViaje(Scanner entrada, infoplanetas planeta, nave nave) {
        // Variables del viaje
        double distanciaRestante = planeta.getDistancia();
        int dias = 0;
        Random random = new Random();

        System.out.println("\n Iniciando viaje a " + planeta.getNombre() + "...");

        // Bucle de simulación del viaje
        while (distanciaRestante > 0 && nave.getVida() > 0 && nave.getOxigeno() > 0) {
            dias++;
            distanciaRestante -= nave.getVelocidad() * 24;
            nave.consumirCombustible(1000);
            nave.consumirOxigeno(1); // Reducción del oxígeno

            // Mostrar estado actual de la nave
            System.out.println("\n Día " + dias);
            System.out.println(" Distancia restante: " + distanciaRestante + " km");
            System.out.println(nave.mostrarInfo());

            // Generación de eventos aleatorios
            int evento = random.nextInt(10);
            switch (evento) {
                case 0:
                    System.out.println("☄ Meteoritos impactan la nave. Vida -20");
                    nave.reducirVida(20);
                    break;
                case 1:
                    System.out.println(" Una nave amiga repara el casco. Vida +15");
                    nave.repararNave(15);
                    break;
                case 2:
                    System.out.println(" Tormenta solar. Vida -10");
                    nave.reducirVida(10);
                    break;
                case 3:
                    System.out.println(" Sistema de reciclaje activado. Oxígeno +5%");
                    nave.aumentarOxigeno(5);
                    break;
                case 4:
                    System.out.println(" Fuga de oxígeno. Oxígeno -10%");
                    nave.consumirOxigeno(10);
                    break;
                default:
                    System.out.println(" Día tranquilo, avanzando sin problemas.");
            }

            // Pausa de 1 segundo para hacer más realista la simulación
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(" Error en la pausa del tiempo.");
                Thread.currentThread().interrupt();
            }
        }

        // Determinar el resultado del viaje
        if (nave.getOxigeno() <= 0) {
            System.out.println(" El viajero ha muerto por falta de oxígeno. GAME OVER.");
        } else if (nave.getVida() <= 0) {
            System.out.println(" ¡La nave ha sido destruida! GAME OVER.");
        } else {
            System.out.println(" ¡Llegaste a " + planeta.getNombre() + " en " + dias + " días!");
            System.out.println(" Enfrentando a " + planeta.getCriaturaFinal() + "... ¡Victoria!");
            System.out.println(" Recibes una mejora tecnológica.");
        }
    }
}