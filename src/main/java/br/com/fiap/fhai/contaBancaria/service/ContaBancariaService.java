package br.com.fiap.fhai.contaBancaria.service;

import br.com.fiap.fhai.contaBancaria.model.ContaBancaria;
import br.com.fiap.fhai.contaBancaria.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public ContaBancaria cadastrar(ContaBancaria contaBancaria) {
        return contaBancariaRepository.save(contaBancaria);
    }

    public ContaBancaria buscarPorId(int id) {
        Optional<ContaBancaria> contaBancaria = contaBancariaRepository.findById(id);
        if (contaBancaria.isPresent()) {
            return contaBancaria.get();
        } else {
            throw new RuntimeException("Conta bancária não encontrada!");
        }
    }

    public List<ContaBancaria> buscarTodos() {
        return contaBancariaRepository.findAll();
    }

    public void excluir(int id) {
        Optional<ContaBancaria> contaBancaria = contaBancariaRepository.findById(id);
        if (contaBancaria.isPresent()) {
            contaBancariaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Conta bancária não encontrada!");
        }
    }

    public ContaBancaria atualizar(int id, ContaBancaria contaBancaria){
        Optional<ContaBancaria> contaBancaria1Atual = contaBancariaRepository.findById(id);
        if (contaBancaria1Atual.isPresent()){
            return  contaBancariaRepository.save(contaBancaria);
        } else {
            throw new RuntimeException("Conta bancária não encontrada.");
        }
    }
}
