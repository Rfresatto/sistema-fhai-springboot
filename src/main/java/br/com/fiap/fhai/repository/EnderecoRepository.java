package br.com.fiap.fhai.repository;

import br.com.fiap.fhai.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
