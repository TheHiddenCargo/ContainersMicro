package arsw.tamaltolimenese.ContainerMicro.controller;


import arsw.tamaltolimenese.ContainerMicro.model.Contenedor;
import arsw.tamaltolimenese.ContainerMicro.service.GeneradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeneradorController {

    @Autowired
    private GeneradorService generadorService;

    @GetMapping("/contenedor")
    public Contenedor obtenerContenedorAleatorio() {
        return generadorService.generarContenedorAleatorio();
    }
}
