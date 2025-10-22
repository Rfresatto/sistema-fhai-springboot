package br.com.fiap.fhai.repository;

import br.com.fiap.fhai.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
