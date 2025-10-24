package br.com.fiap.fhai.contaBancaria.controller;

import br.com.fiap.fhai.contaBancaria.model.ContaBancaria;
import br.com.fiap.fhai.contaBancaria.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conta-bancaria")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContaBancaria cadastrar(@RequestBody ContaBancaria contaBancaria){
        return contaBancariaService.cadastrar(contaBancaria);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ContaBancaria> buscarTodos(){
        return contaBancariaService.buscarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContaBancaria buscarPorId(@PathVariable int id){
        return  contaBancariaService.buscarPorId(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable int id){
        contaBancariaService.excluir(id);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContaBancaria atualizar(@PathVariable int id, @RequestBody ContaBancaria contaBancaria){
        return contaBancariaService.atualizar(id, contaBancaria);
    }
}
