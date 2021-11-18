package br.com.zup.eud.viagens.pais;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String nome;
    private Integer quantidadeDeEstados;

    public Pais(String nome, Integer quantidadeDeEstados) {
        this.nome = nome;
        this.quantidadeDeEstados=quantidadeDeEstados;
    }

    /**
     * @deprecated construtor apenas para o uso do hibernate
     */
    @Deprecated
    public Pais(){}

}
