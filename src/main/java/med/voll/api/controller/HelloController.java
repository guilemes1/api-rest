package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController              //Indicamos para o Spring MVC que essa classe é um controller / Como trabalhamos com uma api Rest usamos RestController
@RequestMapping("/hello")    //Dizemos qual o mapeamento, ou seja, qual a URL que esse controller vai responder
public class HelloController {

    @GetMapping              //Indicamos qual o método do protocolo HTTP é para chamar esse método
    public String olaMundo(){
        return "Hello World Spring!";
    }
}
