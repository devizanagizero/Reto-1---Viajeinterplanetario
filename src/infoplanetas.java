// File: infoplanetas.java
// Clase que representa la información de un planeta
public class infoplanetas {
    private String nombre;
    private long distancia;
    private double gravedad;
    private String atmosfera;
    private String criaturaFinal;

    // Constructor
    public infoplanetas(String nombre, long distancia, double gravedad, String atmosfera, String criaturaFinal) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.gravedad = gravedad;
        this.atmosfera = atmosfera;
        this.criaturaFinal = criaturaFinal;
    }

    // Getters
    public String getNombre() { return nombre; }
    public long getDistancia() { return distancia; }
    public double getGravedad() { return gravedad; }
    public String getAtmosfera() { return atmosfera; }
    public String getCriaturaFinal() { return criaturaFinal; }
}