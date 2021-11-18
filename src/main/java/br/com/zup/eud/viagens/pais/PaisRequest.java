package br.com.zup.eud.viagens.pais;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/*responsabilidade dessa classe é receber os dados da requisição http
 e verificar se as regras  das anotações estão sendo cumpridas,
  caso esteja, no metodo paraPais criamos um pais  para ser salvo no banco de dados */
public class PaisRequest {
    @JsonProperty
    @NotBlank
    private String nome;
    @Min(1)
    @JsonProperty
    private Integer quantidadeDeEstados;

    @JsonCreator
    public PaisRequest(String nome) {
        this.nome = nome;
    }

    public Pais paraPais(){
        return new Pais(nome,quantidadeDeEstados);
    }
}
