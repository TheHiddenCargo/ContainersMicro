package arsw.tamaltolimenese.ContainerMicro.model;


public class Objeto {
    private String nombre;
    private double precio;
    private String color;

    // Constructores, getters y setters
    public Objeto(String nombre, double precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
