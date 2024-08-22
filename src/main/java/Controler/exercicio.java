package Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

public class exercicio {
    @GetMapping
    public String HelloWorldld() {
        return "Hello";
    }

    // @PathVariable = anotação para definir quew a variavel
    // tipo String sera recebida pelo parametro (Nome)
    // WEB - (colocar localhost)

    @GetMapping("/reverter-nome/{nome}")
    public String reverternome(@PathVariable String nome) {
        return new StringBuilder(nome).reverse().toString();
    }
    // WEB -localhost par impar

    @GetMapping("/par-ou-impar/{numero}")
    public String verificarParOuImpar(@PathVariable Integer numero) {
        if (numero % 2 == 0) {
            return "Par";

        } else {
            return "Ímpar";
        }
    }

}
