package br.com.fiap.fhai.service;

import br.com.fiap.fhai.model.Endereco;
import br.com.fiap.fhai.model.Usuario;
import br.com.fiap.fhai.repository.EnderecoRepository;
import br.com.fiap.fhai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public void excluir(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            usuarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

    public Usuario atualizar(int id, Usuario usuario) {
        Optional<Usuario> usuarioAtual = usuarioRepository.findById(id);
        if (usuarioAtual.isPresent()) {
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuário não encontrado.");
        }
    }

    public Usuario adicionarEndereco(int id, Endereco endereco) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setEndereco(endereco);
        return usuarioRepository.save(usuario);
    }

    public boolean enderecoCompleto(int idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return usuario.getEndereco() != null;
    }
}