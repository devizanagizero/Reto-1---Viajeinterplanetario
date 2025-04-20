public class nave {
    private String nombre;
    private double velocidad;
    private double combustible;
    private double oxigeno;
    private int vida;

    // Constructor
    public nave(String nombre, double velocidad, double combustible, double oxigeno, int vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.oxigeno = oxigeno;
        this.vida = vida;
    }

    // Métodos de acceso
    public String getNombre() { return nombre; }
    public double getVelocidad() { return velocidad; }
    public double getCombustible() { return combustible; }
    public double getOxigeno() { return oxigeno; }
    public int getVida() { return vida; }

    // Métodos para modificar los atributos de la nave
    public void reducirVida(int cantidad) { vida = Math.max(0, vida - cantidad); }
    public void repararNave(int cantidad) { vida = Math.min(100, vida + cantidad); }
    public void consumirCombustible(double cantidad) { combustible = Math.max(0, combustible - cantidad); }
    public void consumirOxigeno(double cantidad) { oxigeno = Math.max(0, oxigeno - cantidad); }
    public void aumentarOxigeno(double cantidad) { oxigeno = Math.min(100, oxigeno + cantidad); }

    // Método para mostrar la información de la nave
    public String mostrarInfo() {
        return " Nave: " + nombre + " |  Combustible: " + combustible + "L |  Oxígeno: " + oxigeno + "% |  Vida: " + vida + "/100";
    }
}
