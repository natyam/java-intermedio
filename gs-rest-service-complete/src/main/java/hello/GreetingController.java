package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.PreguntaRespuesta;
import hello.service.PreguntadosServiceImpl;
//import hello.service.PreguntasService;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired 
    private PreguntadosServiceImpl service;
    
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/getPregunta")
    public String pregunta(@RequestParam(value="numero") Integer numero) {
        //PreguntasService service = new PreguntadosServiceImpl();
        return service.getPregunta(numero);
    }
    @RequestMapping("/getRespuesta")
    public String respuesta(@RequestParam(value="numero") Integer numero) {
        return service.getRespuesta(numero);
    }

    @RequestMapping("/getPreguntaRespuesta")
    public PreguntaRespuesta preguntaRespuesta(@RequestParam(value="numero") Integer numero) {
        return service.getPreguntaRespuesta(numero);
    }
    
}
