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
}
