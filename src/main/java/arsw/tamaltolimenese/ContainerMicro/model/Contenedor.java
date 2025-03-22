package arsw.tamaltolimenese.ContainerMicro.model;


import java.util.List;

public class Contenedor {
    private String color;
    private List<Objeto> objetos;

    // Constructores, getters y setters
    public Contenedor(String color, List<Objeto> objetos) {
        this.color = color;
        this.objetos = objetos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }
}
