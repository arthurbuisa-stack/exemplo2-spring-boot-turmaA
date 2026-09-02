package br.com.uam.exemplo2.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;;


@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double preço;

    public Produto() {
       
    }

    public Produto(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public Produto(Long id, String nome, Double preço) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    

    
    
}
