package br.com.fiap.fhai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_FHAI_ENDERECOS")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ENDERECOS")
    @SequenceGenerator(name = "SEQ_ENDERECOS", sequenceName = "SEQ_ENDERECOS", allocationSize = 1)
    @Column(name = "ID_ENDERECO")
    private Long id;
    private String logradouro;
    private String nr_residencia;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String referencia;

    // Construtores
    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, String estado, String referencia) {
        this.logradouro = logradouro;
        this.nr_residencia = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.referencia = referencia;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNr_residencia() {
        return nr_residencia;
    }

    public void setNr_residencia(String nr_residencia) {
        this.nr_residencia = nr_residencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    // Método
    public String getEnderecoCompleto() {
        return logradouro + ", " + nr_residencia +
                (complemento != null ? " - " + complemento : "") +
                " - " + cidade + "/" + estado + " - CEP: " + cep;
    }
}