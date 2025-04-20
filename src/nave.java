// File: nave.java
// Clase que representa la nave espacial con atributos básicos
public class nave {
    private String nombre;
    private double velocidad;   // km/h
    private double combustible; // litros
    private double oxigeno;     // %
    private int vida;           // % integridad (0-100)

    // Constructor
    public nave(String nombre, double velocidad, double combustible, double oxigeno, int vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.oxigeno = oxigeno;
        this.vida = vida;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getVelocidad() { return velocidad; }
    public double getCombustible() { return combustible; }
    public double getOxigeno() { return oxigeno; }
    public int getVida() { return vida; }

    // Métodos de simulación básicos (puedes expandir según tus necesidades)
    public void consumirCombustible(double cantidad) { combustible = Math.max(0, combustible - cantidad); }
    public void consumirOxigeno(double cantidad) { oxigeno = Math.max(0, oxigeno - cantidad); }
    public void reducirVida(int cantidad) { vida = Math.max(0, vida - cantidad); }
    public void repararNave(int cantidad) { vida = Math.min(100, vida + cantidad); }
    public void aumentarOxigeno(double cantidad) { oxigeno = Math.min(100, oxigeno + cantidad); }

    // Mostrar estado
    public String mostrarInfo() {
        return String.format("Nave: %s | Combustible: %.0fL | Oxígeno: %.0f%% | Vida: %d/100", 
            nombre, combustible, oxigeno, vida);
    }
}
