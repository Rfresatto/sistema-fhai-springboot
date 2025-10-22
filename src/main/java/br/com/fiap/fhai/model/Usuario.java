package br.com.fiap.fhai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_FHAI_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIOS")
    @SequenceGenerator(name = "SEQ_USUARIOS", sequenceName = "SEQ_USUARIOS", allocationSize = 1)
    @Column(name = "ID_USUARIO")
    private int id;
    @Column(name = "NM_USUARIO")
    private String nome;
    private String senha;
    private String sexo;
    private String email;
    @Column(name = "NR_CONTATO")
    private long contato;

    public Usuario() {
    }

    public Usuario(int id, String nome, String senha, String sexo, String email, long contato) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.sexo = sexo;
        this.email = email;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContato() {
        return contato;
    }

    public void setContato(long contato) {
        this.contato = contato;
    }
}
