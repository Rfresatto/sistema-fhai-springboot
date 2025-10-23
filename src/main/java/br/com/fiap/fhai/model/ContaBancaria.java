package br.com.fiap.fhai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_FHAI_CONTA")
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTA")
    @SequenceGenerator(name = "SEQ_CONTA", sequenceName = "SEQ_CONTA", allocationSize = 1)
    private int id_conta;
    private String nm_banco;
    private long nr_conta;
    private int agencia;
    private String tp_conta; // "corrente", "poupanca", "salario"
    private double vl_saldo ;
    private int idUsuario;

    public ContaBancaria() {
    }

    public ContaBancaria(int id_conta, String nm_banco, long nr_conta, int agencia, String tp_conta, double vl_saldo, int idUsuario) {
        this.id_conta = id_conta;
        this.nm_banco = nm_banco;
        this.nr_conta = nr_conta;
        this.agencia = agencia;
        this.tp_conta = tp_conta;
        this.vl_saldo = vl_saldo;
        this.idUsuario = idUsuario;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public String getNm_banco() {
        return nm_banco;
    }

    public void setNm_banco(String nm_banco) {
        this.nm_banco = nm_banco;
    }

    public long getNr_conta() {
        return nr_conta;
    }

    public void setNr_conta(long nr_conta) {
        this.nr_conta = nr_conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTp_conta() {
        return tp_conta;
    }

    public void setTp_conta(String tp_conta) {
        this.tp_conta = tp_conta;
    }

    public double getVl_saldo() {
        return vl_saldo;
    }

    public void setVl_saldo(double vl_saldo) {
        this.vl_saldo = vl_saldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
