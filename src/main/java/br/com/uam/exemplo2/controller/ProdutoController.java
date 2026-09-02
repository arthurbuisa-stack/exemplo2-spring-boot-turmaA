package br.com.uam.exemplo2.controller;

import org.springframework.boot.web.server.autoconfigure.ServerProperties.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.uam.exemplo2.model.Produto;
import br.com.uam.exemplo2.repository.ProdutoRepository;
import io.micrometer.core.ipc.http.HttpSender.Response;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository){
        this.repository = repository;



    }

    @PostMapping
    public String criarProduto(@RequestBody Produto produto){
    
        Produto produtoSalvo = repository.save(produto);

        URI location = ServletUriComponetsBuilder.fromCurrent().path("/{id}").buildAndExpand(produtoSalvo.getId()).taUri;
                       

        return "Produto salvo com suçesso";
    }
    
}
