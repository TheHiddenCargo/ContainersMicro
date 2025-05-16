package arsw.tamaltolimenese.ContainerMicro.service;

import arsw.tamaltolimenese.ContainerMicro.model.Contenedor;
import arsw.tamaltolimenese.ContainerMicro.model.Objeto;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GeneradorService {

    private final List<String> colores = Arrays.asList("blanco", "gris", "azul", "dorado");
    private final List<String> nombresObjetos = Arrays.asList("Objeto1", "Objeto2", "Objeto3", "Objeto4");
    private final SecureRandom random = new SecureRandom();

    public Objeto generarObjetoAleatorio(String color) {
        String nombre = nombresObjetos.get(random.nextInt(nombresObjetos.size()));
        int precio = generarPrecioPorColor(color);
        return new Objeto(nombre, precio, color);
    }

    public Contenedor generarContenedorAleatorio() {
        String color = colores.get(random.nextInt(colores.size()));
        List<Objeto> objetos = new ArrayList<>();
        // Limitar a 1 o 2 objetos
        int cantidadObjetos = random.nextInt(2) + 1; // Genera 1 o 2 objetos
        for (int i = 0; i < cantidadObjetos; i++) {
            objetos.add(generarObjetoAleatorio(color));
        }
        return new Contenedor(color, objetos);
    }

    private int generarPrecioPorColor(String color) {
        int min = 0, max = 0;
        switch (color.toLowerCase()) {
            case "blanco":
                min = 10;
                max = 100;
                break;
            case "gris":
                min = 100;
                max = 200;
                break;
            case "azul":
                min = 200;
                max = 500;
                break;
            case "dorado":
                min = 500;
                max = 1000;
                break;
        }
        return random.nextInt((max - min) + 1) + min;
    }
}