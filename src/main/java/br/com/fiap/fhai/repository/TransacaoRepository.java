package br.com.fiap.fhai.repository;

import br.com.fiap.fhai.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

}
