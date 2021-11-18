package br.com.zup.eud.viagens.pais;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController //reponse json
@RequestMapping("/paises")
public class CadastrarNovoPaisController {
    private final PaisRepository paisRepository;

    public CadastrarNovoPaisController(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid PaisRequest request){
        Pais pais = request.paraPais();
        paisRepository.save(pais);
        return ResponseEntity.status(201).build();
    }
}
