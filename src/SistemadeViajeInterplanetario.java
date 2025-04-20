import java.util.Scanner;

public class SistemadeViajeInterplanetario {
    
    /**
     * Permite al usuario elegir un planeta de destino.
     * 
     * @param entrada Scanner para capturar la entrada del usuario.
     * @param marte Objeto que representa el planeta Marte.
     * @param jupiter Objeto que representa el planeta Júpiter.
     * @param neptuno Objeto que representa el planeta Neptuno.
     * @return El planeta seleccionado por el usuario.
     */
    public static infoplanetas elegirPlaneta(Scanner entrada, infoplanetas marte, infoplanetas jupiter, infoplanetas neptuno) {
        System.out.println("\n Selección de planeta:");
        System.out.println("1. Marte (Distancia: " + marte.getDistancia() + " km, Gravedad: " + marte.getGravedad() + ")");
        System.out.println("2. Júpiter (Distancia: " + jupiter.getDistancia() + " km, Gravedad: " + jupiter.getGravedad() + ")");
        System.out.println("3. Neptuno (Distancia: " + neptuno.getDistancia() + " km, Gravedad: " + neptuno.getGravedad() + ")");
        System.out.print("➡ Ingresa el número del planeta que deseas visitar: ");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" Has seleccionado Marte.");
                return marte;
            case 2:
                System.out.println(" Has seleccionado Júpiter.");
                return jupiter;
            case 3:
                System.out.println(" Has seleccionado Neptuno.");
                return neptuno;
            default:
                System.out.println(" Opción inválida. No se seleccionó ningún planeta.");
                return null;
        }
    }

    /**
     * Permite al usuario elegir una nave espacial para el viaje.
     * 
     * @param entrada Scanner para capturar la entrada del usuario.
     * @param nave1 Primera nave disponible.
     * @param nave2 Segunda nave disponible.
     * @param nave3 Tercera nave disponible.
     * @return La nave seleccionada por el usuario.
     */
    public static nave elegirNave(Scanner entrada, nave nave1, nave nave2, nave nave3) {
        System.out.println("\n Selección de nave espacial:");
        System.out.println("1. " + nave1.getNombre() + " (Velocidad: " + nave1.getVelocidad() + " km/h, Combustible: " + nave1.getCombustible() + "L)");
        System.out.println("2. " + nave2.getNombre() + " (Velocidad: " + nave2.getVelocidad() + " km/h, Combustible: " + nave2.getCombustible() + "L)");
        System.out.println("3. " + nave3.getNombre() + " (Velocidad: " + nave3.getVelocidad() + " km/h, Combustible: " + nave3.getCombustible() + "L)");
        System.out.print("➡ Ingresa el número de la nave que deseas utilizar: ");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" Has seleccionado la nave: " + nave1.getNombre());
                return nave1;
            case 2:
                System.out.println(" Has seleccionado la nave: " + nave2.getNombre());
                return nave2;
            case 3:
                System.out.println(" Has seleccionado la nave: " + nave3.getNombre());
                return nave3;
            default:
                System.out.println(" Opción inválida. No se seleccionó ninguna nave.");
                return null;
        }
    }
}