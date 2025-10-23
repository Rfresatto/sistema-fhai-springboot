package br.com.fiap.fhai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_FHAI_CARTAO")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARTAO")
    @SequenceGenerator(name = "SEQ_CONTA", sequenceName = "SEQ_CONTA", allocationSize = 1)
    private int id_cartao;
    private String nm_cartao;
    private long nr_cartao;
    private String tp_cartao; // crédito, débito
    private String nm_titular;
    private String dt_validade;
    private double vl_saldo;
    private int idConta;
    private Transacao transacao;

    public Cartao() {
    }

    public Cartao(int id_cartao, String nm_cartao, long nr_cartao, String tp_cartao, String nm_titular, String dt_validade, double vl_saldo, int idConta, Transacao transacao) {
        this.id_cartao = id_cartao;
        this.nm_cartao = nm_cartao;
        this.nr_cartao = nr_cartao;
        this.tp_cartao = tp_cartao;
        this.nm_titular = nm_titular;
        this.dt_validade = dt_validade;
        this.vl_saldo = vl_saldo;
        this.idConta = idConta;
        this.transacao = transacao;
    }

    public int getId_cartao() {
        return id_cartao;
    }

    public void setId_cartao(int id_cartao) {
        this.id_cartao = id_cartao;
    }

    public String getNm_cartao() {
        return nm_cartao;
    }

    public void setNm_cartao(String nm_cartao) {
        this.nm_cartao = nm_cartao;
    }

    public long getNr_cartao() {
        return nr_cartao;
    }

    public void setNr_cartao(long nr_cartao) {
        this.nr_cartao = nr_cartao;
    }

    public String getTp_cartao() {
        return tp_cartao;
    }

    public void setTp_cartao(String tp_cartao) {
        this.tp_cartao = tp_cartao;
    }

    public String getNm_titular() {
        return nm_titular;
    }

    public void setNm_titular(String nm_titular) {
        this.nm_titular = nm_titular;
    }

    public String getDt_validade() {
        return dt_validade;
    }

    public void setDt_validade(String dt_validade) {
        this.dt_validade = dt_validade;
    }

    public double getVl_saldo() {
        return vl_saldo;
    }

    public void setVl_saldo(double vl_saldo) {
        this.vl_saldo = vl_saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }
}
