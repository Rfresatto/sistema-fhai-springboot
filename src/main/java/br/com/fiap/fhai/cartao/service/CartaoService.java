package br.com.fiap.fhai.cartao.service;

import br.com.fiap.fhai.cartao.model.Cartao;
import br.com.fiap.fhai.cartao.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Cartao cadastrar(Cartao cartao) {
        return cartaoRepository.save(cartao);
    }

    public Cartao buscarPorId(int id) {
        Optional<Cartao> cartao = cartaoRepository.findById(id);
        if (cartao.isPresent()) {
            return cartao.get();
        } else {
            throw new RuntimeException("Cartão não encontrado!");
        }
    }

    public List<Cartao> buscarTodos() {
        return cartaoRepository.findAll();
    }

    public void excluir(int id) {
        Optional<Cartao> cartao = cartaoRepository.findById(id);
        if (cartao.isPresent()) {
            cartaoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cartão não encontrado!");
        }
    }

    public Cartao atualizar(int id, Cartao cartao){
        Optional<Cartao> cartaoAtual = cartaoRepository.findById(id);
        if (cartaoAtual.isPresent()){
            return cartaoRepository.save(cartao);
        }else {
            throw new RuntimeException("Cartão não encontrado.");
        }
    }
}
