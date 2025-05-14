package arsw.tamaltolimenese.ContainerMicro.service;

import arsw.tamaltolimenese.ContainerMicro.model.Contenedor;
import arsw.tamaltolimenese.ContainerMicro.model.Objeto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GeneradorServiceTest {

    @InjectMocks
    private GeneradorService generadorService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldGenerateObject(){
        Objeto objetoBlanco = generadorService.generarObjetoAleatorio("blanco");
        Objeto objetoGris = generadorService.generarObjetoAleatorio("gris");
        Objeto objetoAzul = generadorService.generarObjetoAleatorio("azul");
        Objeto objetoDorado  = generadorService.generarObjetoAleatorio("dorado");
        assertTrue(objetoBlanco.getNombre().equals("Objeto1")
        || objetoBlanco.getNombre().equals("Objeto2")
        || objetoBlanco.getNombre().equals("Objeto3")
        || objetoBlanco.getNombre().equals("Objeto4"));
        assertTrue(10 <= objetoBlanco.getPrecio()||objetoBlanco.getPrecio() <= 100 );
        assertTrue(100 <= objetoGris.getPrecio()||objetoGris.getPrecio() <= 200 );
        assertTrue(200 <= objetoAzul.getPrecio()||objetoAzul.getPrecio() <= 500 );
        assertTrue(500 <= objetoAzul.getPrecio()||objetoAzul.getPrecio() <= 1000 );

    }

    @Test
    void shouldGenerateConatiner(){
        Contenedor contenedor =  generadorService.generarContenedorAleatorio();
        assertTrue(contenedor.getColor().equals("blanco")
            || contenedor.getColor().equals("gris")
            || contenedor.getColor().equals("azul")
            || contenedor.getColor().equals("dorado"));
        assertTrue(!contenedor.getObjetos().isEmpty() && contenedor.getObjetos().size() < 3);
        for(Objeto objeto : contenedor.getObjetos()){
            assertEquals(contenedor.getColor(), objeto.getColor());
        }
    }




}