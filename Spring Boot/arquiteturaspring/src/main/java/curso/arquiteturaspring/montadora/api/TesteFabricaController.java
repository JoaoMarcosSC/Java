package curso.arquiteturaspring.montadora.api;

import curso.arquiteturaspring.montadora.CarroStatus;
import curso.arquiteturaspring.montadora.Chave;
import curso.arquiteturaspring.montadora.HondaHRV;
import curso.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
